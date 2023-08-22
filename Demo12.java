public class Demo12 {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        //     for (int k = 0; k < 5; k++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        printStar(1, 1);
    }

    public static void printStar(int x){
        if (x == 26) return;
        System.out.print("* ");
        if (x % 5 == 0) System.out.println();
        printStar(++x);
    }

    public static void printStar(int row, int col){
        System.out.print("* ");
        if (row == 5 && col == 5) return;
        col++;
        if (col == 6) {
            col = 1;
            row++;
            System.out.println();
        }
        printStar(row, col);
    }
}
