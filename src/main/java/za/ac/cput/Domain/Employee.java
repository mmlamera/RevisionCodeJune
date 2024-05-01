package za.ac.cput.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.Objects;
@Entity
public class Employee {

    @Id
    private String empNo;
    private String fName;
    private String lName;

    public Employee() {
    }

    public Employee(Builder builder){
       this.empNo = builder.empNo;
       this.fName = builder.fName;
       this.lName = builder.lName;

    }

    public String getEmpNo() {
        return empNo;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empNo, employee.empNo) && Objects.equals(fName, employee.fName) && Objects.equals(lName, employee.lName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, fName, lName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo='" + empNo + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    public static class Builder{
        private String empNo;
        private String fName;
        private String lName;

        public Builder setEmpNo(String empNo) {
            this.empNo = empNo;
            return this;
        }

        public Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public Builder copy(Employee emp){
            this.empNo = emp.empNo;
            this.fName = emp.fName;
            this.lName = emp.lName;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}
