public class Demo4 {
    public static void main(String[] args) {
        System.out.println("I am in the main method");
        myMethod1(2);
        System.out.println("I am about to exit");
    }

    public static void myMethod1(int count){
        System.out.println("I am in the myMethod1");
        myMethod2();
        System.out.println("I am back and I am now in the myMethod1 again");
        myMethod3();
    }

    public static void myMethod2(){
        System.out.println("I am in the myMethod2");
    }

    public static void myMethod3(){
        System.out.println("I am in the myMethod3");
    }
}
