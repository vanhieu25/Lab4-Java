package theory;

public class constructor {
    public static void main(String[] args) {
        System.out.println("runnn");
        Student st = new Student();
        System.out.println("check objet"+ st.name);
        Student st1 = new Student("hieu",21);
        System.out.println("check"+st1.name+st1.age);
    }
}
