package Day3;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter a number");
Scanner in = new Scanner(System.in);
int n=in.nextInt();

if((n&1)==0){
    System.out.println("Even Number: "+n);
    
}
System.out.println("odd Number:"+n);
      
    in.close(); }
}
