// Employee Bonus Calculation Create a class Employee with name, salary, and yearsOfExperience. Write a method calculateBonus():
// If experience > 5 years, bonus = 20% of salary . Otherwise, bonus = 10% of salary . Display the bonus amount for each employee.
public class Employee{
    String name;
    double salary;
    int yearsOfExperience;
    public Employee ( String name, double salary, int yearsOfExperience){
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }
public void calculateBonus(){
    double bonus;
    if( yearsOfExperience > 5){
        bonus = salary * 0.2;
    }else{
        bonus = salary *0.1;
    }
    System.out.println("Employee name:"+ name);
    System.out.println("Salary: $" + salary);
    System.out.println("Experience: " + yearsOfExperience);
    System.out.println("Bonus: $" + bonus);
    System.out.println("___________________");
}
public static void main(String[] args){
Employee emp1 = new Employee("John", 50000,5);
Employee emp2 = new Employee("Lara", 60000,7);
Employee emp3 = new Employee("Aureian", 80000,4);
emp1.calculateBonus();
emp2.calculateBonus();
emp3.calculateBonus();
}
}