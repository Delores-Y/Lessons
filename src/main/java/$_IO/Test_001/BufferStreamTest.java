package $_IO.Test_001;

import java.io.*;

public class BufferStreamTest {

    public  static void main(String[] args)throws IOException {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        try {
            //创建字节输入流
            fis=new FileInputStream("/Users/heylee/Hubs/Art/A_Projects/Lessons/src/main/java/$_IO/Test_001/test.txt");
            //创建字节输出流
            fos=new FileOutputStream("/Users/heylee/Hubs/Art/A_Projects/Lessons/src/main/java/$_IO/Test_001/test_new.txt");
            //创建字节缓存输入流
            bis=new BufferedInputStream(fis);
            //创建字节缓存输出流
            bos=new BufferedOutputStream(fos);

            byte[] b=new byte[1024];
            int hasRead=0;
            //循环从缓存流中读取数据
            while((hasRead=bis.read(b))>0){
                //向缓存流中写入数据，读取多少写入多少
                bos.write(b,0,hasRead);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            bis.close();
            bos.close();
        }
    }

}
