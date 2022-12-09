package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 * <p>
 * 1) Demonstrate the usage of at least two additional Byte Streams
 * 2) Demonstrate the usage of at least two additional Character Streams
 * 3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 * 4) Demonstrate the use of the DataInputStream and DataOutputStream
 */
class ByteStream {
    public static void main(String[] args) throws IOException {

        try (FileInputStream in = new FileInputStream("src/labs_examples/input_output/files/char_data.txt");
             FileOutputStream out = new FileOutputStream("src/labs_examples/input_output/files/char_data_out.txt")
        ) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }


        try (FileInputStream in = new FileInputStream("src/labs_examples/input_output/files/char_data.txt");
             BufferedInputStream bf_input = new BufferedInputStream(in)
        ) {
            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bf_input.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bytesRead));
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}

class CharStream {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/labs_examples/input_output/files/char_data.txt");
             FileWriter fw = new FileWriter("src/labs_examples/input_output/files/char_data_out02.txt")
        ) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                BufferedReader bf_reader = new BufferedReader(new FileReader("src/labs_examples/input_output/files/char_data.txt"));
                PrintWriter pw = new PrintWriter(new FileWriter("src/labs_examples/input_output/files/char_data_out03.txt"))) {
                String l;

                while ((l = bf_reader.readLine()) != null) {
                    pw.println(l);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}