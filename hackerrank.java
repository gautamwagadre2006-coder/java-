import java.util.Scanner;

public class hackerrank {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s=sc.next();
                 int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s,x);
            // printf is used to format the output. %-15s means left-justified string with a width of 15 characters, and %03d means an integer with at least 3 digits, padded with zeros if necessary.
            // %-15s%03d%n is a format string that specifies how the output should be formatted. The %n is a platform-independent newline character.
        
            }
             System.out.println("================================"); 
             sc.close();
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s=sc.next();
             int x=sc.nextInt();
             while (s.length()<15){
                 s=s+" ";
             }
             String x1=String.valueOf(x);
                while (x1.length()<3){
                    x1="0"+x1;
                }
                System.out.println(s+x1);
        }
         System.out.println("================================"); 
         sc.close();
    }
}