package theory;

public class main {
    int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("runn");
        Student hieu = new Student();
        hieu.age = 23;
        hieu.name = "hieu";
        System.out.println("name: "+ hieu.name+" age: "+hieu.age);
        main test = new main();
        int a = test.sum(9,5);
        System.out.println("sum "+ a);
    }
}
