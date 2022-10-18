public class Student{
    //Object atributes
    String name;
    int age;
    int semester_nr;
    double av_grade;
    String studentID;
    boolean validity;
    
    //Object Behaviour/ Methods
    public void sayHello(){
        System.out.println("Hello!");
    };
    public void displayName(){
        System.out.println("My name is " + name);
    };
    public void displayAge(){
        System.out.println("My age is "+ age);
    };
    public void displayAll(){
        System.out.println(
        "my semester number is "+ semester_nr); 
        System.out.println("My average grade is: " + av_grade);
        System.out.println("My student ID is:" +studentID);
    };
    public void displayValidity(){
        System.out.println("My name is "+ name);
        System.out.println("Card validity is " + validity);
    }
    public void changeCardValidity(){
        validity = !validity;
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Ion";
        s1.age = 20;
        s1.studentID = "222600";
        s1.validity = true;
        s1.semester_nr = 3;
        s1.av_grade = 4.30;
        
        
    }

}
    
