import java.util.Scanner;

 class SimpleInterest {
    public static void Interest(int p, int r, int t){
        int x = (p*t*r)/100;
        System.out.println(x);

    }

        public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
     Interest(p,r,t) ;



                                                                                          // p - principal amount , t - tenure/time , r-rate
    }                                                                                 //formula p*t*r/100
}
