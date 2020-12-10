package com.javamasterclass.inputoutput;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class RenameFile {
    public static void main(String[] args) {
        try {
            Path fileToMove = FileSystems.getDefault().getPath("Examples","file2.txt");
            Path destination = FileSystems.getDefault().getPath("Examples","file1.txt");
            Files.move(fileToMove, destination);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
