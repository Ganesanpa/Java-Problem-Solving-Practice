package Day11;

public class Overriding{
  public static void main (String[] args) {
    two obj = new two();
    obj.show();
    obj.display();
  }
}

class one{
  void show(){
    System.out.println("Peter Parker");
  }
  void display(){
    System.out.println("Display");
  }
}
class two extends one{
  void show(){
    System.out.println("Spider man");
  }
  void display(){
    System.out.println("Display Child");
  }
}