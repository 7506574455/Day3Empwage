
public class EmpWelcome {
     
   private static int IsFullTime = 1;
   private static int EmpPerHr = 20;
   private static int IsPartTime = 2;

   public static void main(String[] args) {

       checkEmp();
   }
   public static void checkEmp() {
       int empHrs = 0;
       int empWage = 0;

       double empCheck = Math.floor(Math.random() * 10) % 3;
       if(empCheck == IsPartTime)
           empHrs = 4;
       else if (empCheck == IsFullTime)
           empHrs = 8;
       else
           empHrs = 0;
       empWage = empHrs * EmpPerHr;
       System.out.println("Emp Wage: " + empWage);
   }
}
