package $_IO.NIO.Channel;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileChannelTest {

    public static void main(String[] args) throws IOException {

        //1.创建一个RandomAccessFile（随机访问文件）对象，
        RandomAccessFile raf = new RandomAccessFile("/Users/heylee/Hubs/Art/A_Projects/Lessons/src/main/java/$_IO/NIO/test.txt", "rw");
        FileChannel inChannel = raf.getChannel();

        /*
         * Java.nio.charset.Charset处理了字符转换问题。
         * 它通过构造CharsetEncoder和CharsetDecoder将字符序列转换成字节和逆转换。
         */
        Charset charset = Charset.forName("UTF-8");
        CharsetDecoder decoder = charset.newDecoder();


        String newData = "New String to write to file..." + System.currentTimeMillis();
//        String newData = "hello world hello world hello world hello world hello world hello world hello world hello world hello world hello world ";
        ByteBuffer buf = ByteBuffer.allocate(1000);
        buf.clear();
        buf.put(newData.getBytes());
        buf.flip();
        while (buf.hasRemaining())
            inChannel.write(buf);
        System.out.println(buf);


        //关闭RandomAccessFile（随机访问文件）对象
        inChannel.close();
        raf.close();
    }
}
