public class typecasting {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int num1 = 100;
        double num2 = num1; // int to double
        System.out.println("Implicit Type Casting (Widening): " + num2);

        // Explicit Type Casting (Narrowing)
        double num3 = 9.99;
        int num4 = (int) num3; // double to int
        System.out.println("Explicit Type Casting (Narrowing): " + num4);

        char a= 'A';
        System.out.println((int)a); // char to int (ASCII value)
        int b=67;
        System.out.println((char)b); // int to char (ASCII value)
        // method 2
        char ch= 'b';
        System.out.println(ch+0); // char to int (ASCII value) by adding 0

        int c= 68;
        System.out.println((char)c); // int to char (ASCII value)
    }
}
 class A{
        public static void main(String[] args) {
 int A=10;
 A++; // incrementing operator ++ adds 1 to the variable A
 // A-- decrementing operator -- subtracts 1 from the variable A
 //++A pre-increment operator increments the value of A before using it in an expression, 
 //while A++ post-increment operator increments the value of A after using it in an expression.
      System.out.println(A);
    }
}

