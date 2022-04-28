import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c = in.read()) >= 0) {
                //只用流来读取字符直到尾端，每读一个字符就将其显示出来
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
