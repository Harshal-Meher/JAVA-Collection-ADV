public class Employee {

    private Integer empId;
    private String empName;
    private Integer empAge;
    private String empSalary;
    private String empDesination;

    public Employee(Integer empId, String empName, Integer empAge, String empSalary, String empDesination) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
        this.empDesination = empDesination;
    }

    public Employee() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpDesination() {
        return empDesination;
    }

    public void setEmpDesination(String empDesination) {
        this.empDesination = empDesination;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empSalary='" + empSalary + '\'' +
                ", empDesination='" + empDesination + '\'' +
                '}';
    }
}
