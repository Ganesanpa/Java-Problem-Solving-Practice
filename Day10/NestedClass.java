package Day10;

public class NestedClass
{
	public static void main(String[] args) {
	 one obj = new one();
	 one.two obj2 = new one().new two();
	obj.show();
	obj2.show();
	    
	}
}
class one{ 
    int a ;
    one(){ 
        System.out.println("Outer class");
    }
    class two{ 
        int b ; 
        two(){ 
            System.out.println("Inner class");
        }
        void show(){
            System.out.println("Inner class show");
        }
    }
    void show(){
        System.out.println("Outer class show");
    }
}
