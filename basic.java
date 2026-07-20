public class basic {
    public static void main(String[] args) {
        animal obj = new dog();
        obj.display();
    } 
}
class animal {
       private String name;
       private int age;
       public void setAge(int age){
           this.age= age;
       }
       public void setName(String name){
           this.name= name;
       }
       public String getName(){
        return name;
       }
       public int getAge(){
        return age;
       }
       void eat(){
        System.out.println("this animal eats ");
       }
          void display(){
        System.out.println("Age is" + age);   
       } 
    }
    
 class dog extends animal{
       void display2 (){
        System.out.println(" xxx");
       }
 }

