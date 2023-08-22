public class Demo13 {
    public static void main(String[] args) {
        
        // for (int k = 0; k < 5; k++) {
        //     for (int i = 0; i < 5- k; i++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        printStar(5, 5);
    }

    public static void printStar(int col, int row){
        if (col == 0) {
            col = (row-1);
            row--;
            System.out.println();
        }
        if (row == 0) return;
        System.out.print("* ");
        col--;
        printStar(col, row);
    } 

    // public static void printStar(int col, int row){
    //     if (col == (5 - row )) {
    //         col = 0;
    //         row++;
    //         System.out.println();
    //     }
    //     if (row == 5) return;
    //     System.out.print("* ");
    //     col++;
    //     printStar(col, row);
    // }    

   


}
