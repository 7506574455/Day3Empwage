
public class EmpWelcome {

     public static void main(String[] args) {
             //constants
       int IS_FULL_TIME = 1;
       int EMP_PER_HR = 20;
           //variables
       int empHr = 0;
       int empWage = 0;
       double empCheck = Math.floor(Math.random() * 10) % 2;
       if (empCheck == IS_FULL_TIME)
           empHr = 8;
       else
           empHr = 0;
       empWage = empHr * EMP_PER_HR;
           System.out.println("Emp Wage: " + empWage);
   }
}
