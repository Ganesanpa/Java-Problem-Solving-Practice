package Day13;

import java.util.*;
public class abstractconcept {
    public static void main(String[] args) {
    ATM user = new SBI(); 
    user.withdraw();
  }
}
abstract class ATM{
  abstract void withdraw(); // abstract Method
  void show(){  // concrete Method
    System.out.println("Welcome to our ATM");
  }
}
class SBI extends ATM{
  Scanner sc= new Scanner(System.in);
  //                0  1  2  3  4 
   int accNo[]={ 12,34,45,67,78};
  private int pin[] = { 123,345,456,78,879};
  private int balance[] = { 1230,3405,4056,780,8709};
  void withdraw(){
    System.out.println("Enter Account Number");
    int accCheck = sc.nextInt() , verify =-1; // 45
    for(int i =0;i<accNo.length ;i++){
      if(accCheck == accNo[i] ){
        verify = i ; 
        break;
      }
    }
    if(verify == -1){
      System.out.println("Incorrect Account");
    }
    else{
      System.out.println("Enter Pin Number : ");
      int pinCheck = sc.nextInt();
      if(pin[verify] == pinCheck){
        System.out.println("Enter Amount to be withdraw :");
        int amount  = sc.nextInt();
        if(balance[verify] < amount){
          System.out.println("Insufficient Balance");
        }
        else{
          System.out.println("Debited "+amount);
          balance[verify] -=amount;
          System.out.println("Current Balace : "+balance[verify]);
        }
      }
      else{
        System.out.println("Incorrect PIN");
      }
    }
    
  }
}
class HDFC extends ATM{
    void withdraw(){
    System.out.println("Enter Amount to withdraw");
    System.out.println("Enter pin Number");
    }
}