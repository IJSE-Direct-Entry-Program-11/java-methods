public class Demo6 {
    public static void main(String[] args) {
        int num = 10;
        myMethod(num);
        System.out.println(num);    // 10
    }

    public static void myMethod(int num){
        num = 20;
    }
}
