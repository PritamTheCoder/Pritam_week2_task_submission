// Student Grading (Switch Statement) Create a Student class with name and marks. 
//Write a method calculateGrade() that assigns a grade (A, B, C, D, F) based on marks using a switch or if-else ladder. 
//Create 3 students and display their grades.
public class Student{
    String name;
    double marks;
public Student(String name, double marks){
    this.name = name;
    this.marks = marks;
}
public String calculateGrade(){
String grade;
if(marks >= 90 ){
    grade = "A";
}else if(marks >= 80){
    grade = "B";
}else if(marks >= 70){
    grade = "C";
}else if(marks >= 60){
    grade = "D";
}else{
    grade = "F";
}
return grade;
}
public void displayStudentDetail(){
    System.out.println("Student Name: "+ name);
    System.out.println("Marks: " + marks);
    System.out.println("Grade: " + calculateGrade());
    System.out.println();
}
public static void main(String[] args){
    Student student1 = new Student("Joe Hendry", 95);
    Student student2 = new Student("James Leonard", 80);
    Student student3 = new Student("Florence Edward", 77);

    student1.displayStudentDetail();
    student2.displayStudentDetail();
    student3.displayStudentDetail();
}
}