import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        //针对字节
        int c = super.read();
        return (c == -1?c:Character.toLowerCase((char) c));
    }

    public int read(byte[] b,int offset,int len)throws IOException {
        //针对字节数组，将每个是大写字符的字节转成小写(每个代表一个字符)
        int result  = super.read(b,offset,len);
        for (int i=offset;i<offset+result;i++){
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
