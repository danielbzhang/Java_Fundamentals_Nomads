package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 * <p>
 * -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 * -For example, change every 'a' to '-' and every 'e' to '~' .
 * -Make sure you close the connections to both files.
 * <p>
 * Then, read back the encrypted file using the BufferedReader and
 * print out the unencrypted version. Does it match the original file?
 */

class Example02 {
    public static void main(String[] args) throws IOException {

//        BufferedReader br = null;
//        PrintWriter pw = null;

        String fileInPath = "src/labs_examples/input_output/files/KtoD.txt";
        String fileOutPath = "src/labs_examples/input_output/files/KtoDOut.txt";
        int i;

        String fileOutPath2 = "src/labs_examples/input_output/files/KtoDOut02.txt";
        int j;

        try (BufferedReader br = new BufferedReader(new FileReader(fileInPath));
             PrintWriter pw = new PrintWriter(new FileWriter(fileOutPath))) {

            while ((i = br.read()) != -1) {
                if ((char) i == 't') {
                    i = '!';
                }
                if ((char) i == 'h') {
                    i = '@';
                }
                if ((char) i == 'i') {
                    i = '*';
                }
                if ((char) i == 's') {
                    i = '$';
                }
                pw.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(fileOutPath));
             PrintWriter pw = new PrintWriter(new FileWriter(fileOutPath2))) {

            while ((j = br.read()) != -1) {
                if ((char) j == '!') {
                    j = 't';
                }
                if ((char) j == '@') {
                    j = 'h';
                }
                if ((char) j == '*') {
                    j = 'i';
                }
                if ((char) j == '$') {
                    j = 's';
                }
                pw.print((char) j);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}