package Day6;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
	        
	        int n; 
	        n = sc.nextInt(); 
	        
	        int[] a = new int[n]; 
	        
	        for (int i = 0; i < n; i++) { 
	            a[i] = sc.nextInt(); 
	        }
	        
	         int l=a[1],s=a[1];
	        for (int i = 0; i < n; i++) {
              
				for(int j=0;j<n;j++){
                    if(l<=a[j]){
                       l=a[j];
                    }else if(s>=a[j]){
                        s=a[j];
                    }
                }
       
            }
        System.out.println("large:"+l);
       System.out.println("Small:"+s);
 sc.close();   }
    
}
