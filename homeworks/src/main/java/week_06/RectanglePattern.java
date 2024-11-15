package week_06;

public class RectanglePattern {
    /**
     * print a rectangle pattern with  *
     */


        public static void printRectangle(int row, int column){
            for (int i= 0; i < row; i++){
                for (int j= 0; j < column; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
       printRectangle(4, 6);
    }


}
