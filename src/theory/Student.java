package theory;

public class Student {
    public Student(){

    }
    public  Student(String name, double age){
        this.name = name;
        this.age = age;
    }
    // Class Attributes (Thuộc tính của Class)
    String name;
    double age;
    int year;
    // Class Method (Phương thức của class)
    public void learnJava(){
        System.out.println("RUNNNN");
    }
    // Method Overloading (Nạp chồng phương thức)
    public void learnJava(double age){
        System.out.println("RUNNNN");
    }
    int getAge(){
        return 25;
    }
}

