package Day4;


public class program{
    public static void main(String[] args) {
    //      Scanner s=new Scanner(System.in);
    //   int n=s.nextInt();
      int n=5,k=2;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j){
                System.out.print(1+" ");
            }else{
                if(k>9)
                    k=1;
                     System.out.print(k+" ");
                   k++;

                }
                 
    }
     System.out.println();
 
}
    }
}