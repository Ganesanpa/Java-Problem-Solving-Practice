package Day11;

	class Father{
			    int bankBalance ;
			    Father(){
			        System.out.println("Father constructor");
			        bankBalance= 100000;
			    }
			}
			class Son extends Father{
			    int balance ;
			    String car;
			    Son(){
			        System.out.println("son constructor");
			        balance= 50000;
			        car ="Mustang";
			    }
			}
			class Daughter extends Father{
			    int balance ;
			    String car;
			     Daughter(){
			         System.out.println("Daughter Constructor");
			         balance= 50000;
			         car ="Tesla";
			     }
			}
			public class Hierarchical{
			    public static void main (String[] args) {
			        Son s= new Son();
			        Daughter d = new Daughter();
			        System.out.println(s.bankBalance);
			        System.out.println(d.bankBalance);
			    }
			}