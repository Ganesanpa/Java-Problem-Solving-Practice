package Day10;

public class constructer {
    public static void main(String[] args) {
   student data1=new student();   
   data1.studentData();
   data1.studentData("ganesan", 911722104035l);
   data1.studentData("ganesan", 911722104035l,2004);
   data1.show(); 
}
   
    
}
 class student{
    String name;
    long RegNo;
    int age;

      void   studentData(){
        this.name="ganesh";
        this.RegNo=911722104035l;
        this.age=20;
        }
         void   studentData(String name,long RegNo){
        this.name="ganesh";
        this.RegNo=911722104035l;
    
        }
         void   studentData(String name,long RegNo,int age){
        this.name="ganesh";
        this.RegNo=911722104035l;
        this.age=20;
        }

void show(){
    System.out.println(name);
    System.out.println(RegNo);
    System.out.println(age);
}

    }