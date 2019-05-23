


import com.netty.qqw.utils.HttpClientUtil;
import org.apache.spark.ml.linalg.Vector;
import org.apache.spark.ml.linalg.Vectors;
import org.junit.Test;

import java.util.HashMap;


public class MLlibText {
    @Test
    public void show(){

        //https://iphone.ac.qq.com/5.19.3/Community/addFollow/user_qq/487962879?v_uin=641901550
        HashMap hashMap =new HashMap<>();
        hashMap.put("v_uin","641901550");
        String s = HttpClientUtil.doPost("https://iphone.ac.qq.com/5.19.3/Community/addFollow/user_qq/487962879", hashMap, "UTF-8");
        System.out.println(s);
    }
}
