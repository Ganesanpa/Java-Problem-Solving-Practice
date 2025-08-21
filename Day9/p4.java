package Day9;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        String in=sc.nextLine();
        char[] arr=in.toCharArray();
        String vow="aeiouAEIOU";
        int v=0,c=0,s=0,n=0;
        for(char i:arr){
            if(i>='A' && i<= 'Z' ||i>='a' && i<= 'z' ){
           if(vow.indexOf(i)!=-1)
           {
v++;
           }else
           c++;
             }else if(i>='0'&&i>='9'){
                n++;
             }else{
                s++;
             }
             }
   System.out.println("VowlCout: "+v); 
   System.out.println("NumberCount: "+n); 
   System.out.println("ConsonantCount"+c); 
   System.out.println("SpecialcharacterCount:"+s); 
sc.close();}
}
