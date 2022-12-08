package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Input/Output Exercise 1: File input/output
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 */

class Example {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = null;
        FileInputStream inputStream = null;

        String filePath = "src/labs_examples/input_output/files/byte_data";

        try {
            inputStream = new FileInputStream(filePath);
            bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] buffer = new byte[5];
            int byteRead = 0;

//            byteRead = bufferedInputStream.read(buffer);
            while((byteRead = bufferedInputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0 , byteRead));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            bufferedInputStream.close();
        }
    }

}