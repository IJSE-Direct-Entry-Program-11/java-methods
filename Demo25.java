public class Demo25 {
    public static void main(String[] args) {
        short s = 5;
        myMethod(s, s, 10, 10 );
    }

    // static void myMethod(short x, short y, int a, long z){
    //     System.out.println("myMethod(short,short,int,long)");
    // }

    static void myMethod(int x, short y, int a, long z){
        System.out.println("myMethod(int,short,int,long)");
    }
    
    static void myMethod(int x, short y, int a, float z){
        System.out.println("myMethod(int,short,int,float)");
    }    
}
