package Day12;


final class FinalClass {
   
    final int MAX_VALUE = 100;

    final void displayMessage() {
        System.out.println("This is a final method in FinalClass. MAX_VALUE = " + MAX_VALUE);
    }
}


class Parent {
    
    final int FIXED_VALUE;

   
    Parent(int value) {
        this.FIXED_VALUE = value; 
    }

   
    final void showFixedValue() {
        System.out.println("Fixed value in Parent: " + FIXED_VALUE);
    }

    void regularMethod() {
        System.out.println("This is a regular method in Parent.");
    }
}


class Child extends Parent {
    Child(int value) {
        super(value); 
    }

   
    @Override
    void regularMethod() {
        System.out.println("This is an overridden method in Child.");
    }

   
}


public class FinalKeywordDemo {
    public static void main(String[] args) {
       
        final int CONSTANT = 50;
        System.out.println("Final variable CONSTANT: " + CONSTANT);
       
        FinalClass finalObj = new FinalClass();
        finalObj.displayMessage();
       
        Parent parent = new Parent(42);
        parent.showFixedValue(); 
        parent.regularMethod();  
        Child child = new Child(99);
        child.showFixedValue(); 
        child.regularMethod();  

        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); 
        System.out.println("Final StringBuilder: " + sb);
        
    }
}

