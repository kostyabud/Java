package com.java_io;


import java.io.File;

import static com.java_io.Element.displayAllCatalogAndFiles;
import static com.java_io.Element.readInformationFromFile;

public class Main {
    public static void main(String[] args)
    {
        String directories = "";
        for (String arg : args) {
            directories += arg;
        }
//      displayAllCatalogAndFiles(new File(directories));
        readInformationFromFile(directories);
    }
}
