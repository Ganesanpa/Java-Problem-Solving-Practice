package Day9;

import java.util.Scanner;

public class equalCheck {
    public static void main(String[]args){
 Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       
int f=0;
        for(int i=0;i<n;i++){
     String p=s.nextLine();
     s.nextLine();
     String t=s.nextLine();

    char[] arr1=t.toCharArray();
    char[] arr2=p.toCharArray();
    f=0;
    for(int j=i;j<arr2.length;j++){
        if(arr1[i]!=arr2[j]){
            arr2[j]='\0';
            f=1;
           break;
        }
      
    }
  if(f==0)
        break;}

        System.out.println((f==0)?"False":"True");
   s.close();
     
        }

    }

