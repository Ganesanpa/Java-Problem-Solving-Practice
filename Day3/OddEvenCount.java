package Day3;
import java.util.*;
public class OddEvenCount{
    public static void main(String[] args) {
        System.out.println("Enter a number");
Scanner in = new Scanner(System.in);
int n=in.nextInt();
int odd=0,even=0;
while(n!=0){
    int last=n%10;
    n=n/10;
    if(last%2==0){
     even+=last;
    }else{
        odd+=last;
    }
}
System.out.println("Even: "+even);
System.out.println("odd :"+odd);
   in.close();  }
}