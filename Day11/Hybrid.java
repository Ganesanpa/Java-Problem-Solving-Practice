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
			class Daughter extends Father{
			    String car;
			    Daughter(){
			        System.out.println("Sister Constructor "+land +"  "+ house);
			        car = "Tesla";
			    }
			}
			public class Hybrid
			{
				public static void main(String[] args) {
				Grandpa g = new Grandpa();
			    Father f = new Father();
			    Son s = new Son();
			    Daughter d= new Daughter();
				System.out.println(g.land);
				System.out.println(f.house);
				System.out.println(s.car);
				System.out.println(d.car);
				}
			}

