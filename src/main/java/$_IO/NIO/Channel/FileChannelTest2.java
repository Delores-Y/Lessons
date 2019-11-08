package $_IO.NIO.Channel;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileChannelTest2 {

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


        //2.创建一个读数据缓冲区对象
        ByteBuffer buf = ByteBuffer.allocate(40);
        CharBuffer charBuffer = CharBuffer.allocate(40);
        //3.从通道中读取数据 从FileChannel中读取的数据将被读到Buffer中。
        //read()方法返回的int值表示了有多少字节被读到了Buffer中。如果返回-1，表示到了文件末尾。
        int bytesRead = inChannel.read(buf);
        System.out.println("first read:" + new String(buf.array()));


        while (bytesRead != -1) {
            System.out.println("Read " + bytesRead);
            //Buffer有两种模式，写模式和读模式。在写模式下调用flip()之后，Buffer从写模式变成读模式。
            buf.flip();
            // decoder.decode(buf, charBuffer, false);
            // charBuffer.flip();
            //如果还有未读内容
            while (buf.hasRemaining()) {
                System.out.print((char) buf.get());
                // System.out.print(charBuffer.get());
            }
            System.out.println();
            // 清空buffer
            buf.clear();
            charBuffer.clear();
            bytesRead = inChannel.read(buf);
        }
        //关闭RandomAccessFile（随机访问文件）对象
        inChannel.close();
        raf.close();
    }
}
