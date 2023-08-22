public class Demo16 {
    public static void main(String[] args) {
        int value = calFactorial(5);
        System.out.println(value);
    }

    public static int calFactorial(int value){
        if (value == 0) return 1;
        return calFactorial(--value) * value;
    }
}
