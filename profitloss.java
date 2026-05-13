import java.util.Scanner;
public class profitloss {

    public static void main(String [] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the cost price");
        double cp=sc.nextDouble();
        System.out.println("Enter the selling price");
        double sp=sc.nextDouble();
        double profit=sp-cp;
        double loss=cp-sp;
        if(profit>0){
            System.out.println("Profit = "+profit + "and percentage profit="+(profit/cp)*100);
        }
        else if(loss>0){
            System.out.println("Loss = "+loss + "and percentage loss="+(loss/cp)*100);
        }
        else{
            System.out.println("No profit, no loss");
        }

    }
}

class divisible{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if num%5==0 && num%11==0){
            System.out.println(num+" is divisible by 5 and 11");
        }
        else{
            System.out.println(num+" is not divisible by 5 and 11");
        }
    }
}