public class Demo24 {
    public static void main(String[] args) {
        short b = 5;
        myMethod(10.2f, b, 10.f);
    }

    // static void myMethod(float x, double d, int z){
    //     System.out.println("myMethod(float, double, int)");
    // }

    // static void myMethod(float x, float y, float z){
    //     System.out.println("myMethod(float, float, float)");
    // }

    static void myMethod(float x, double d, float z){
        System.out.println("myMethod(float, double, float)");
    }

    // static void myMethod(long x, float y, double z){
    //     System.out.println("myMethod(long, float, double)");
    // }

    static void myMethod(double d, float x, float y){
        System.out.println("myMethod(double, float, float)");
    }
}
