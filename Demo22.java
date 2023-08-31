public class Demo22 {
    public static void main(String[] args) {
        byte b = 10;
        myMethod(10, b);
    }

    static void myMethod(int x, int y){
        System.out.println("myMethod(int, int)");
    }

    // static void myMethod(int x, byte b){
    //     System.out.println("myMethod(int, byte)");
    // }

    static void myMethod(long x, long y){
        System.out.println("myMethod(long, long)");
    }
}
