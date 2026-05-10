import java.util.Scanner;
//importing the Scanner class from the java.util package, which allows us to read user input from the console
public class input {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    //creating an instance of the Scanner class called sc, which will be used to read user input
    System.out.println("enter the value of lengthand");
        int length =sc.nextInt();
        //nextInt() is used to read an integer value from the user input and store it in the variable length
        System.out.println("enter the value of breadth");
        double  breadth =sc.nextDouble();
        //nextDouble() is used to read a double value from the user input and store it in the variable breadth
        //data type of breadth is double because it can have decimal values, while length is an integer so it is declared as int
        double area=length*breadth;
        System.out.println("the area of the rectangle is: "+area);
    }
    }
class sum{
    public static void main(String[] args) {
    Scanner gautam=new Scanner(System.in);
     System.out.println("enter the numbers ");
    int s=gautam.nextInt();
    int y=gautam.nextInt();
    int x=gautam.nextInt();
    int sum=s+y+x;
    System.out.println("the sum of the numbers is: "+sum);

    // rule in the operation 
    // int/double =double
    // int/int=int
    //double/double=double 
    //double/int=double
    // when all values are in int and output is asked in double the output will be wrong for solutin add .0
}
    
}
