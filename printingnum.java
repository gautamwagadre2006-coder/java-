public class printingnum {

public static void main(String[] args) {
    int y = 67;
    System.out.println(y);
    System.out.println(y=y+40);
    // y = y+40; before this line y is 67 and after this line y is 107
    //because we are adding 40 to 67 and storing it in y again
    // so the value of y is updated to 107 
    // similar with minus and multiplication and division
}
}
