import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ScoketServerTest {
    public static void main(String[] ar){
        ScoketServerTest scoketServerTest =new ScoketServerTest();
        scoketServerTest.show();
    }
    public void show(){
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.socket().bind(new InetSocketAddress(7090));
            while(true){
                SocketChannel socketChannel =
                        serverSocketChannel.accept();
                //ByteBuffer byteBuffer = ByteBuffer.allocate(456);
                System.out.println(socketChannel.socket().getInetAddress().toString());
                ByteBuffer buf = ByteBuffer.allocate(48);
                while (true){
                    int bytesRead = socketChannel.read(buf);
                    while (bytesRead != -1) {
                        System.out.println("Read " + bytesRead);
                        buf.flip();
                        while(buf.hasRemaining()){
                            System.out.print(String.valueOf(buf.get()));
                            //buf.compact();
                        }
                        System.out.println();
                        buf.compact();
                        bytesRead = socketChannel.read(buf);
                    }
                    //刷新缓存
                    buf.compact();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
