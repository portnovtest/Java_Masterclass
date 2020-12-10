package com.javamasterclass.inputoutput;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateFiles {
    public static void main(String[] args) {
        try {
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples","file2.txt");
//            Files.createFile(fileToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.createDirectory(dirToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir2/Dir3/Dir4/Dir5/Dir6");
            Path dirToCreate = FileSystems.getDefault().getPath("Examples/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
            Files.createDirectories(dirToCreate);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
