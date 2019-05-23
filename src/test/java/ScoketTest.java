import com.netty.qqw.entity.WhResult;
import com.netty.qqw.utils.ProtostuffSerialize;
import io.netty.buffer.ByteBuf;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

public class ScoketTest {
    static int port = 9006;
    static String host = "192.168.1.86";
    static SocketChannel socketChannel = null;
    static {
        try {
            socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress(host,port));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

   /* public void show() {
        try {
            File  file =new File("data/nio-data.txt");
            if (!file.exists()){
                file.getParentFile().mkdirs();
                //file.mkdirs();
                file.createNewFile();
            }
            RandomAccessFile aFile = new RandomAccessFile(file, "rw");
            FileChannel inChannel = aFile.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(48);

            int bytesRead = inChannel.read(buf);
            while (bytesRead != -1) {

                System.out.println("Read " + bytesRead);
                buf.flip();

                while(buf.hasRemaining()){
                    System.out.print((char) buf.get());
                }

                buf.clear();
                bytesRead = inChannel.read(buf);
            }
            aFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    /**
     * java nio
     */
    public void sendMessage(WhResult<String> whResult){

        try {
            //这里的4代表message的长度所占字节

            //byte[] bytes = message.getBytes("UTF-8");
            byte[] bytes = new ProtostuffSerialize<String>().serializeProtoStuffWhResult(whResult);
            int length = bytes.length;
            //分配数据长度，以数据大小以及前缀的数据结束长度的大小为主
            int i = 4 + length;
            ByteBuffer byteBuffer = ByteBuffer.allocate(i);
            //设置数据
            byteBuffer.putInt(length);
            byteBuffer.put(bytes);
            //写出数据
            socketChannel.write(ByteBuffer.wrap(byteBuffer.array()));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        }

    }

    public static void allwayRead() throws IOException {
        while (true){
            ByteBuffer byteBuffer = ByteBuffer.allocate(999);
            try {
                while (socketChannel.read(byteBuffer)>0);
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] array = byteBuffer.array();
            WhResult<String> whResult = new ProtostuffSerialize<String>().deserializeProtoStuffDataToWhResul(array);
            System.out.println(whResult.getDate());
        }


    }

    @Test
    public void read() throws IOException {
        this.allwayRead();
    }

    public static  void main(String[] arg) throws IOException {
        //allwayRead();
        ScoketTest scoketTest =new ScoketTest();
        String mes = "你还啊飒飒大受打击阿里斯柯达";
        int read = System.in.read();

        WhResult<String> whResult =new WhResult<>();
        whResult.setDate(mes);
        scoketTest.sendMessage(whResult);
        /*try {
            socketChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //scoketTest.show2("号");
    }
}
