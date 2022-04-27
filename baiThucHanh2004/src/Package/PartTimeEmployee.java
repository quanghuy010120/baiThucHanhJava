package Package;

public class PartTimeEmployee extends Employee {
  public int numberOfDayWork;
  public void addNumberOfDayWork(){
    System.out.println("Number of day working");
    numberOfDayWork = sc.nextInt();
  }
  public int Salary(){
    return numberOfDayWork*50000;
  }
  public void typeOfEmployee(){
    System.out.println("Type of employee: Part-time employee");
  }
}