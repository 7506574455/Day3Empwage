
public class EmpWelcome {
     
   public static void main(String[] args) {
        int EmpPerHr = 20;
        int WorkingDays = 20;
        int MaxHrMonth = 100;
        //variables
        int empHr = 0;
        int totalempHr = 0;
        int totalWorkingDays = 0;

        while (totalempHr <= MaxHrMonth && 
               totalWorkingDays < WorkingDays) {
            totalWorkingDays++;
               int empCheck = (int) Math.floor(Math.random() * 10) % 3;
               switch (empCheck) {
                   case 1:
                       empHr = 4;
                       break;
                   case 2:
                       empHr = 8;
                       break;
                   default:
                       empHr = 0;
               }
               totalempHr += empHr;
               System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHr);
        }
        int totalEmpWage = totalempHr * EmpPerHr;
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}
     
   
