package za.ac.cput.factory;
import za.ac.cput.Domain.Employee;
import za.ac.cput.util.Helper;

public class EmployeeFactory {
 public static Employee buildEmp(String empNo, String fName, String lName){
     if(Helper.isNullOrEmpty(empNo) || Helper.isNullOrEmpty(fName) || Helper.isNullOrEmpty(lName)) {
         return null;
     }
     return new Employee.Builder()
             .setEmpNo(empNo)
             .setfName(fName)
             .setlName(lName)
             .build();
 }
 public static Employee buildEmp(String fName, String lName){
     if(Helper.isNullOrEmpty(fName) || Helper.isNullOrEmpty(lName)){
         return null;
     }
     String empNum = Helper.generateId();
     return new Employee.Builder()
             .setfName(fName)
             .setlName(lName)
             .build();
    }

    //email validation
    //email validation
    //email validation

}
