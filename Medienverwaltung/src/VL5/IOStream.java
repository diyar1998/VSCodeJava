package VL5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOStream {

    public static void main(String[] args) {
//        copy(new File("C:\\Users\\49179\\Desktop\\copytest.txt"), new File("C:\\Users\\49179\\Desktop/test.txt"));
//        cat(new File("C:\\Users\\49179\\Desktop\\copytest.txt"));
        test(System.out);
    }

    static void test(OutputStream outStream) {

        PrintWriter pw = new PrintWriter(outStream);
        pw.println("");
        pw.flush();
    }

    static void cat(File quelle) {
        try (RandomAccessFile raf = new RandomAccessFile(quelle, "rw"))
        {
            String s;
            while ((s = raf.readLine()) != null)
            {
                System.out.println(s);

            }
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(IOStream.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex)
        {
            Logger.getLogger(IOStream.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void copy(File from, File to) {
        try (FileInputStream in = new FileInputStream(from); FileOutputStream out = new FileOutputStream(to))
        {
            int c;
            while ((c = in.read()) != -1)
            {
                out.write(c);

            }

        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(IOStream.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex)
        {
            Logger.getLogger(IOStream.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally
        {

        }
    }
}
