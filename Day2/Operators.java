package Day2;
import java.util.*;

public class Operators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        int[] marks = {32, 45, 98, 75, 63};
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("s" + (i + 1) + " : " + marks[i]);
            total += marks[i];
        }
        float avg = (float) total / marks.length;
        System.out.printf("Hi! %s\nTotal : %d\nAvg : %.2f\n", name, total, avg);
        System.out.println("------------------------------------------");

       
        int a = 65, b = 45;
        System.out.println("A : " + (a<b));
        System.out.println("------------------------------------------");

     
        int x = 54, y = 98, z = 22;
        int max = Math.max(x, Math.max(y, z));
        System.out.println("B: " + max);
        System.out.println("------------------------------------------");

        
        int year = 2024; 
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is Not a Leap Year");
        System.out.println("------------------------------------------");

        
        int num = 456341;
        int last = num % 10;
        int secondLast = (num / 10) % 10;
        if (last % 2 != 0 && secondLast == 4)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println("------------------------------------------");

   
        int number = 98;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
        System.out.println("------------------------------------------");

      
        int age = 19;
        System.out.println(age >= 18 ? "Eligible" : "Not Eligible");
        System.out.println("------------------------------------------");

        
        int val = -45;
        System.out.println(val < 0 ? "-ve" : "+ve");
    input.close(); }
}
