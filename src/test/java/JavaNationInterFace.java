public class JavaNationInterFace {
    static
    {
        //System.load(resource.getPath());
        System.loadLibrary("JniDemo");
    }

    public native void sayHello();
    //@SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        new JavaNationInterFace().sayHello();
    }
}
