import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter # of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter # of colums: ");
        int colums = scanner.nextInt();
        System.out.println("Enter Symbol: ");
        String symbol = scanner.next();

        for (int i = 0; i < rows; i++){
            System.out.println();
            for (int j = 0; j < colums; j++){
                System.out.print(symbol);
            }
        }

    }
}