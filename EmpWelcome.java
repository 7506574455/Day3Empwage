
public class EmpWelcome {
     
   private static final int IsFullTime = 1;
   private static final int IsPartTime = 2;
   private static final int EmpPerHr = 20;
   private static final int WorkingDays = 2;

   public static void main(String[] args) {

       checkEmp();
   }
   public static void checkEmp() {
        //variables
       int empHr = 0;
       int totalWage = 0;
       int empWage = 0;

       for (int day = 0; day<WorkingDays; day++) {
           int empCheck = (int) Math.floor(Math.random() * 10) % 3;
           switch (empCheck) {
           case IsPartTime:
               empHr = 4;
               break;
           case IsFullTime:
               empHr = 8;
               break;
           default:
               empHr = 0;
       }
       empWage = empHr * EmpPerHr;
       totalWage += empWage;
       System.out.println("Emp Wage: " + empWage);
    }
    System.out.println("Total EmpWage: " + totalWage);
   }
}
     
   
