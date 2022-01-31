package mztech.classwork;

import java.io.*;

public class FileInputAndOutput {
    /*
    A stream can be defined as a sequence of data. There are two kinds of Streams −

InPutStream − The InputStream is used to read data from a source.

OutPutStream − The OutputStream is used for writing data to a destination.
     */
    public static void main(String[] args) throws IOException {
        // Following is an example which makes use of these two classes to copy an input file into an output file −

        //variable for input file
        FileInputStream in = null;
        //variable for output file
        FileOutputStream out = null;

        try {
            //another way: in = new FileInputStream(System.getProperty("user.dir") + "/src/input.txt");
            in = new FileInputStream("C:\\Users\\Owner\\Desktop\\IdeaProjects\\JavaCore\\src\\mztech\\classwork\\input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) // keep reading the file by each bite until end of the line
                /*
                 M Z T E C H
                 0 1 2 3 4 5

                 here c= index number
                 */ {
                out.write(c); // writes output file
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
