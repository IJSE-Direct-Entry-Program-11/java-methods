public class Demo3 {
    public static void main(String... args) {
        myMethod(2);
        myMethod(1);
        myMethod(3);
    }

    public static void myMethod(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("myMethod: " + i);
        }
        System.out.println("-----------");
    }
}
