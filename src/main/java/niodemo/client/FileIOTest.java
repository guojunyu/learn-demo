package niodemo.client;

import java.io.*;

public class FileIOTest {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        byte[] buffer = new byte[10];
        int count = 0;
        try {
            inputStream = new FileInputStream(new File("D:\\DEMO\\MyDemo\\test.txt"));
            outputStream = new FileOutputStream(new File("D:\\DEMO\\MyDemo\\test1.txt"),true);
            int tmpRead;
            while ( (tmpRead = inputStream.read(buffer)) != -1){
                count ++;
                outputStream.write(buffer,0,tmpRead);
            }
            inputStream.close();
            System.out.println("count:" + count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
