package Day4;
import java.util.*;
public class problem2 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.err.println("Enter number");
      int n=s.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i%2==0){
                System.out.print("*");
            }
            else{
                System.out.print("#");
            }
           

    }
     System.out.println();
}
 s.close();}
}
