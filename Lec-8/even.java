import java.util.Scanner;

class even {    
   public static void checkEvenorOdd(int a){
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }


 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        checkEvenorOdd(a);
        }
    }

    
 
