package Day12;

public class Encapsulation {
   
    public static void main(String[] args) {
    User1 frnd = new User1(); 
    frnd.setName("User2");
    System.out.println(frnd.getName());
  }
}
class User1{
 private String name; // data hiding
 private   String pass; // data hiding
 private long  aadhar=910115115388l;  // data hiding
 void setName(String n){ // setter
   name = n;
 }
 void setPass(String password){ //setter
   pass = password;
 }
 String getName(){ //getter
   return name;
 }
 String getPassWord(){ //getter
   return pass;
 }
 long getAadhar(){ // getter
    return aadhar;   
 }

}
