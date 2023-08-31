public class Demo28 {
    public static void main(String[] args) {
        myMethod(10, 5, 5);
    }

    // static void myMethod(int x, Integer y, float f){
    //     System.out.println("A. myMethod(int,Integer,float)");
    // }

    // static void myMethod(int x, long y, float f){
    //     System.out.println("B. myMethod(int, long, float)");
    // }

    static void myMethod(Integer x, int... y){
        System.out.println("C. myMethod(Integer, int...)");
    }

    // static void myMethod(int x, Integer y, int... z){
    //     System.out.println("D. myMethod(int, Integer, int...)");
    // }

    // static void myMethod(Integer x, Long l, int z){
    //     System.out.println("E. myMethod(Integer, Long, int)");
    // }
}
