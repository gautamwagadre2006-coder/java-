import java.util.*;
public class loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("my name is Gautam");
        }
        // for loop is used when we know the number of iterations
        // while loop is used when we don't know the number of iterations
        // do-while loop is used when we want to execute the loop at least once
  
        int j = 1;
        while (j <= 10) {
            System.out.println(j*2);
            j++;
        }
        Scanner sc=new Scanner (System.in);
        int k=sc.nextInt();
        do {
            System.out.println("gautam");
            k++;   
        } while (k<10);
  }
}
