package com.java_io;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Element {
        public final String indent;
        public final File file;

        public Element(String indent, File file)
        {
            this.indent = indent;
            this.file = file;
        }

        public String toString()
        {
            return indent + file.getName();
        }

        public static void displayAllCatalogAndFiles(File directories){
            File dir = new File(String.valueOf(directories));
            try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("e:/Homework/Java/data/name.txt")))) {
                if (!dir.exists() || !dir.isDirectory())
                {
                    writer.println("Incorrect directory name");
                }
                Deque<Element> stack = new ArrayDeque<>();
                stack.add(new Element("|-", dir));
                while (!stack.isEmpty())
                {
                    Element element = stack.pollLast();
                    writer.println(element);
                    if (element.file.isDirectory())
                    {
                        File[] files = element.file.listFiles();
                        for (int i = files.length - 1; i >=0; i--)
                        {
                            stack.add(new Element(element.indent + "-- ", files[i]));
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}



