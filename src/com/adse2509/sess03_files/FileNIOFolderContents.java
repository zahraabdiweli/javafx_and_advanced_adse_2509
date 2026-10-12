package com.adse2509.sess03_files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileNIOFolderContents {

    public static void main(String[] args) {
        System.out.println("Please enter the path to the directory whose "
                + "contents you wish to list/display:");

        try (Scanner sc = new Scanner(System.in)) {
            Path path2Directory = Paths.get(sc.nextLine().trim());

            if (!Files.isDirectory(path2Directory)) {
                System.err.println("The path is not an existing directory: "
                        + path2Directory);
                return;
            }

            System.out.println("The contents of " + path2Directory);
            System.out.println("-".repeat(85));

            try (DirectoryStream<Path> directoryStream =
                         Files.newDirectoryStream(path2Directory)) {
                for (Path path : directoryStream) {
                    System.out.println(path);
                }
            }

            System.out.println("_".repeat(85));

        } catch (InvalidPathException e) {
            System.err.println("The path entered is invalid: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Could not read the directory: " + e.getMessage());
        }
    }
}