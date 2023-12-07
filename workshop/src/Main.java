public class Main {
    public static void printHallowPattern(int lin, int col){
        for(var i = 1; i <= lin; i++){
            for(var j = 1; j <= col; j++){
                if(i == 1 || j == 1 || i == lin || j == col)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }
    public static void main(String[] args) {
        printHallowPattern(5, 5);

    }
}