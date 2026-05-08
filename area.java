public class area {
    public static void main(String[] args) {
        int length=5;
        int breadth=3;
        int area=length*breadth;
        System.out.println("the area of the rectangle is: "+area);
    
        int r=4;
        double pi=3.14;
        double areaofcircle=pi*r*r;
        System.out.println("the area of the circle is: "+areaofcircle);
        // in java when double is used to store decimal numbers the result will be in double precision


// rule for naming variables in java
// 1. variable names must start with a letter, underscore or dollar sign 
// 2. variable names cannot start with a number
// 3. variable names cannot contain spaces
// 4. variable names cannot be a reserved keyword in java
// 5. variable names should be meaningful and descriptive
 System.out.println("the area of sphere is:"+ 4*pi*r*r);
 int l =6;
 int b=10;
 int h=5;
 System.out.println("total surface area of cuboid is :"+ 2*(l*b+b*h+l*h));
}
}