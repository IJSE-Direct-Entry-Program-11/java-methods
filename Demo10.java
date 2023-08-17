public class Demo10 {
    static int num = 10;

    public static void main(String[] args) {
        System.out.println(num);    // 10
        num = 20;
        System.out.println(num);    // 20
        updateValue();
        System.out.println(num);    // 30
    }

    public static void updateValue(){
        num = 30;
        System.out.println("This is a Side-effect method");
    }

    public static void myMethod(){
        System.out.println("This is a pure method");
    }

    public static void myFun(int x){
        System.out.println(x + 10);
        System.out.println("This is still a pure method");
    }
}
