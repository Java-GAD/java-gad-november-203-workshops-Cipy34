public class Main {
    public static void printHallowPattern(int lin, int col){
        for(int i = 1; i <= lin; i++){
            for(int j = 1; j <= col; j++) {
                if (i == 1 || j == 1 || i == lin || j == col)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void printTrianglePattern(int lin){
        for(int i = 1; i <= lin; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        printHallowPattern(5, 5);
        printTrianglePattern(5);

    }
}