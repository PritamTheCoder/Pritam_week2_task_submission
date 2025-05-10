public class Student {
    public String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
    Student std1 = new Student("Pritam", 0);
    System.out.println("Name: " +std1.name+ "Age:"+ std1.age);
    } 
}