package com.java_io;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

import static com.java_io.Element.displayAllCatalogAndFiles;

public class Main {
    public static void main(String[] args)
    {
        String directories = "";
        for (int i = 0; i < args.length; i++) {
            directories += args[i];

        }
        displayAllCatalogAndFiles(new File(directories));



    }
}
