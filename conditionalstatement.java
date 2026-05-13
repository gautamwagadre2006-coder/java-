import java.util.Scanner;
public class conditionalstatement {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if (num%5==0 && num%11==0){
            System.out.println(num+" is divisible by 5 and 11");
        }
        else{
            System.out.println(num+" is not divisible by 5 and 11");
        }
        if (num%2==0 || num%3==0 || num%5==0){
            System.out.println(num+" is divisible by 2 or 3 or 5");
        }
        else{
            System.out.println(num+" is not divisible by 2 or 3 or 5");
        }
    }
}
