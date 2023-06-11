
public class Main {
    public static void main(String[] args) {
        ManagmentEmployee system = new ManagmentEmployee();
       try {
           while (true) {
               switch (system.showMenu()) {
                   case 1:
                       system.show();
                       break;
                   case 2:
                       system.addEmployee();
                       break;
                   case 3:
                       system.edit();
                       break;
                   case 4:
                       system.del();
                       break;
                   case 5:
                       system.calculatorSalary();
                       break;
                   case 6:
                       system.readFile();
                       break;
                   case 7:
                       system.wirteFile();
                       break;
                   case 8:
                       system.attendanceEmployee();
                       break;
                   case 9:
                       return;
               }
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
