package Day11;

class Grandpa{
			    int land ;
			    Grandpa(){
			        System.out.println("Grandpa Constructor");
			        land = 500;
			    }
			    void FarmHouse(){
			        System.out.println("I have 100sq feet FarmHouse");
			    }
			}
			class Father extends Grandpa{
			    int house;
			    Father(){
			        System.out.println("Father Constructor");
			        house = 3;
			    }
			    void business(){
			      System.out.println("I have Minning business");  
			    }
			}
			class Son extends Father{
			    String car;
			    Son(){
			        System.out.println("Son Constructor");
			        car ="Mustang";
			    }
			    void kabaddi(){
			        System.out.println("I am a Kabaddi player");
			    }
			}
			public class MultiLevel
			{
				public static void main(String[] args) {
				Grandpa g = new Grandpa();
				System.out.println(g.land);
			    Father f = new Father();
				System.out.println(f.house);

			    Son s = new Son();
				System.out.println(s.car);

				}
			}
