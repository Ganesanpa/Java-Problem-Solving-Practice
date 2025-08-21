package Day12;

//this
// ========================================================================
public class ThisKeyword
{    	public static void main(String[] args) {
		One o = new One(12,234,23);
		System.out.println(o);
		One t = o.ref();
		System.out.println(t);	
		}  
	}
class One{
    int a , b ,c;
    
    
    One(){
    this(12,34,23); // calling current class constructor
     a= 12;
     b=13;
     c=14;
     System.out.println("default constructor"); 
        
    }
    
    
    One(int a , int b, int c){
      System.out.println("3 parameter constructor");
        this.a=a;// refering current class properties
        this.b=b;
        this.c=c;
        this.display();// calling current class method  
         }
         
         
    One ref(){
        return this; // returns current class Object refernce    
  }
  
  
    void display(){       
        
        System.out.println(a+" "+b+" "+c); 
        
    }   
    
}  
   
