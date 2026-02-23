import java.util.*;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int n = sc.nextInt();

        int star = 1;
        int space = n - 1;
        int row = 1;

        while (row <= 2 * n - 1) {

            // space part
            int j = 1;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }

            // star part
            int i = 1;
            while (i <= star) {
                System.out.print("*");
                i++;
            }

            // update values
            if (row < n) {
                star++;
                space--;
            } else {
                star--;
                space++;
            }

            System.out.println();
            row++;
        }
    }
}
