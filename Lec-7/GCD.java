import java.util.Scanner;


public class GCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
 while (b>0){
    int rem = a%b;
    a=b;
    b=rem;
 }
 System.out.println(a);
}
}
  //  another way

/*while(a%b! =0)
int rem= a%b;
a=b;
b=rem;
}
System.out.println(a);
}
}
*/
