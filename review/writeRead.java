import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class FileReadWrite {

    public static void main(String[] args) {
        try {
            // write() "Start from the beginning" ; overwrite
            FileWriter fw = new FileWriter("note.txt");
            fw.write("Start from the beginning");
            fw.close();

            // AppendMode " Add to the end" 
            FileWriter fwAppendMode = new FileWriter("note.txt", true);
            fwAppendMode.write(" Add to the end");
            fwAppendMode.close();

            // read file content character by character
            FileReader fr = new FileReader("note.txt");
            int character;
            while ((character = fr.read()) != -1) {
                System.out.print((char) character);
            }
            fr.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
