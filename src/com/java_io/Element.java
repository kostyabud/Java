package com.java_io;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

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
            int countDirectories = 0;
            try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("e:/Homework/Java/data/name.txt")))) {
                if (!dir.exists() || !dir.isDirectory())
                {
                    System.err.println("Incorrect directory name");
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
                            stack.add(new Element(element.indent + "  ", files[i]));
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void readInformationFromFile(String file){
            int countFile = 0;
            int countDir = 0;
            int allLength = 0;
            try(FileReader reader = new FileReader(String.valueOf(file));
                BufferedReader bufferedReader =  new BufferedReader(reader)) {
                String line = null;
               while((line = bufferedReader.readLine()) != null){
                   if(line.endsWith(".txt")){
                       countFile++;
                       StringTokenizer str = new StringTokenizer(line);
                       while (str.hasMoreTokens()){
                           str.nextToken().length();
                           allLength += str.nextToken().length();
                       }
                   } else {
                       countDir++;
                   }
               }

            } catch (IOException e) {
                e.printStackTrace();
            }

            int averageFileInCatalog = countFile / countDir;
            allLength = allLength / countFile;
            System.out.println("Файлов = " + countFile + "\n " + "Папок = " + countDir
                    + "\n " + "Среднее количество файлов в папке = " + averageFileInCatalog
                    + "\n " + "Среднее длина названия файла = " + allLength);
        }
}



