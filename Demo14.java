public class Demo14 {
    public static void main(String[] args) {
        printStar(5, 0);
    }

    public static void printStar(int col, int row){
        if (col == 0) {
            row++;
            if (row <= 3){
                col = 5 - row;
            }else{
                col = row - 1;
            }
            System.out.println();
        } 
        if (row == 7) return;
        System.out.print("* ");
        printStar(--col, row);
    }
}
