import java.util.ArrayList;

public class VolatileTest {

    public static volatile String s = "aaa";
    public static  String s1 = "aaa";
    public static void main(String[] ar){
        ArrayList<String> arr = new ArrayList<>();
        APojo aPojo =new APojo();
        aPojo.setA(arr);
        aPojo.setB(arr);
        arr.add("sdf");
        s = aPojo.getA().get(0);
        s1 = aPojo.getB().get(0);
        aPojo.getA().set(0,"aa");
        System.out.println(s);
        System.out.println(s1);
    }
}

class APojo{
    private volatile ArrayList<String> a;
    private ArrayList<String> b;

    public ArrayList<String> getA() {
        return a;
    }

    public void setA(ArrayList<String> a) {
        this.a = a;
    }

    public ArrayList<String> getB() {
        return b;
    }

    public void setB(ArrayList<String> b) {
        this.b = b;
    }
}

