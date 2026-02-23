
import java.util.Scanner;

class Maxofthree{  
   public static void Maxofthree(int a,int b, int c){
        if (a > b && a>c ) {
            System.out.println("a is bigger");
            
        }else if(b>a && b>c) {
         System.out.println("b is bigger");
        }
        else{
            System.out.println("c is bigger");
    }

   }
 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Maxofthree(a,b,c);
        }
    }


    
 
