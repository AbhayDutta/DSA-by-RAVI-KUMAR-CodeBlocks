import java.util.Scanner;

public class PrimeNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int prime = 1;
        int num = sc.nextInt();

      for(int i=2;i<num;i++){
        if(num%i==0){
            prime=0;
            break;
        }
        }
        if(prime==1){
            System.out.println(num+" is a prime number.");
        }else{
            System.out.println(num+" is not a prime number.");
        }
    }
}
