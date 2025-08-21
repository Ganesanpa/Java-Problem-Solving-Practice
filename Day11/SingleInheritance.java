package Day11;


public class SingleInheritance
{
	public static void main(String[] args) {
	  Son son = new Son();
	  Daughter daughter = new Daughter();
	  son.swim();
	  daughter.swim();
	}
}
class GrandParent{
  String land  ;
  GrandParent(){
    System.out.println("GrandParent Constructor");
    land = "5000Acre";
  }
}
class Parent extends GrandParent{
    String house ;
    Parent(){
        System.out.println("Parent Constructor");
        house="3BHK";
    }
    void swim(){
        System.out.println("I can Swim");
    }
    
}
class Son extends Parent{
    String car ;
    Son(){
        System.out.println("Child construtor");
        car = "Ferrari";
    }
    void doNothing(){
        System.out.println("Eat *****");
    }
}
class Daughter extends Parent{
  String car  ;
  Daughter(){
    car = "BMW";
  }
    void doNothing(){
        System.out.println("Eat *****");
    }
}






