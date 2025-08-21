package Day11;

public class Polymorphism {
	public static void main(String []rc) {
		OverLoading o = new OverLoading();
		o.fun(12.0f,13.5f);   
		}}
class OverLoading{
	
      void fun() {
    	  System.out.println("Hello");
      }
      void fun(int n) {
    	  System.out.println("Hello "+n);
      }
      void fun(int  n ,int m) {
    	  System.out.println("Hello "+n+m);
      }
      void fun(float n,float m) {
    	  System.out.println(n+"  "+m);
      } 
      }
