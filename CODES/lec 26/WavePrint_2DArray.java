
import java.util.*;
public class WavePrint_2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of m and n :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter elements :");
        
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(int j=0; j<n; j++){
            if(j%2==0){
                for(int i=0; i<m; i++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int i=m-1; i>=0; i--){
                    System.out.print(arr[i][j] + " ");
                }

            }
        }
    }
}