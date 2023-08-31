public class Demo27 {
    public static void main(String[] args) {
        myMethod(10);
    }

    // static void myMethod(Integer...x){
    //     System.out.println("A. myMethod(...Integer)");
    // }    

    // static void myMethod(int x){
    //     System.out.println("B. myMethod(int)");
    // }

    static void myMethod(int... x){
        System.out.println("C. myMethod(...int)");
    }

    static void myMethod(Integer x){
        System.out.println("D. myMethod(Integer)");
    }

    static void myMethod(float x){
        System.out.println("E. myMethod(long)");
    }
}
