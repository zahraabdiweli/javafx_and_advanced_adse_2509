package com.adse2509.sess05_multithreading_and_concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {

    private static final int THRESHOLD = 1_000;

    private static class ArraySumTask extends RecursiveTask<Long> {
        private static final long serialVersionUID = 1L;

        private final int[] array;
        private final int start;
        private final int end; // Exclusive

        ArraySumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            int length = end - start;

            if (length <= THRESHOLD) {
                long sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            }

            int middle = start + length / 2;

            ArraySumTask leftTask = new ArraySumTask(array, start, middle);
            ArraySumTask rightTask = new ArraySumTask(array, middle, end);

            leftTask.fork();
            long rightResult = rightTask.compute();
            long leftResult = leftTask.join();

            return leftResult + rightResult;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[10_000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        try (ForkJoinPool pool = new ForkJoinPool()) {
            long sum = pool.invoke(
                    new ArraySumTask(numbers, 0, numbers.length)
            );
            System.out.println("Sum: " + sum);
        }
    }
}