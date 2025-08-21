package Day4;
import java.util.*;
public class program1 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==n/2){
                    System.out.print("-");
                }
            else if(i==0&&j==0||i==0&&j==n-1||i==n-1&&j==0||i==n-1&&j==n-1){
                System.out.print("*");
                
            }else{
            System.out.print("#");}

        }
        System.out.println();
    }
  s.close();}
}
