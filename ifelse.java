import java.util.Scanner;

public class ifelse {

 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of a and b");
   int a=sc.nextInt();
   int b=sc.nextInt();
    if(a>b){
        System.out.println("a is greater than b");
    }
    else{
        System.out.println("b is greater than a");
    }  
}
}
class divisible{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("n is divisible by 5");
        }
        else{
            System.out.println("n is not divisible by 5");
        }
    }
}
class number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        double n=sc.nextDouble();
        if(n>0){
            System.out.println("n is positive");
        }
        else if(n<0){
            System.out.println("n is negative");
        }
        else{
            System.out.println("n is zero");
        }
    }

}
