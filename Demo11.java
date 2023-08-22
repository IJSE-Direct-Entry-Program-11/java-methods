public class Demo11 {
    public static void main(String[] args) {
        myMethod(0);               
    }

    public static void myMethod(int x){
        System.out.println("Hello World!");
        if (x < 2)
        myMethod(++x);
    }
}
