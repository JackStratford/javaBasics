import java.util.Scanner;
import java.util.Arrays;

public class App {
    private static Scanner read = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        newOrder();
    }

    private static void newOrder () {
        int orderNumber = 0;

        Coffee orderNumber = new Coffe();
        
        System.out.println("enter customer name: ");
        String customer = read.next();
        System.out.println("alocate the table from 1 to 10 : ");
        int table = read.nextInt();
        orderNumber +=1;

    }
}
