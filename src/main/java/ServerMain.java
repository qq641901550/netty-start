import com.netty.qqw.db.MongoDBJDBC;
import com.netty.qqw.spring.SpringLoad;
import com.netty.qqw.tcp.TcpServer;

public class ServerMain {
    public static void main(String[] ar){
        //SpringLoad springLoad =new SpringLoad();
        //MongoDBJDBC mongoDbjdbc = springLoad.getMongoDbjdbc();
        //mongoDbjdbc.save();
        TcpServer tcpServer =new TcpServer();
        tcpServer.startServer();
    }
}
