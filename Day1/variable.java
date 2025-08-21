
import java.util.Scanner;
public class variable {
    
    public static void main(String[] args) {
        int a=65;
        int b=24;
        int temp;
         System.out.println("before swaping:");
        System.out.println(a);
        System.out.println(b);
        temp=a;
        a=b;
        b=temp;
         System.out.println("after swaping:");
        System.out.println(a);
        System.out.println(b);
 
        Scanner n= new Scanner(System.in);

    System.out.print("Enter the diameter of the circle: ");
    double d = n.nextDouble();
    double radius=d/2;
    double area = Math.PI * radius * radius;
    System.out.printf("The area of the circle is: %.2f%n", area);
    n.close();
    }
}