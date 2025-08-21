package Day6;
import java.util.Scanner;
public class p2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	        
	        int n; 
	        n = sc.nextInt(); 
	        
	        int[] a = new int[n]; 
	        
	        for (int i = 0; i < n; i++) { 
	            a[i] = sc.nextInt(); 
	        }
	        
	        int e=0,o=0;
	        for (int i = 0; i < n; i++) {
				if(a[i]%2==0){
	            e+=a[i];
			}
			else{
				o+=a[i];
			}
	        }
			System.out.println("Even:"+ e);
			System.out.println("Odd:"+o);
    sc.close();}
}
