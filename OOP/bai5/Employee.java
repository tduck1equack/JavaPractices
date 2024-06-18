package Files.OOP.bai5;

public class Employee {
    // Attributes
    public int EmployeeCode;
    public String FullName;
    public String Department;
    public String Address;
    public String PhoneNumber;
    // Getters and Setters


    public int getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    // Methods
    public Employee(int employeeCode, String fullName, String department, String address, String phoneNumber) {
        this.EmployeeCode = employeeCode;
        this.FullName = fullName;
        this.Department = department;
        this.Address = address;
        this.PhoneNumber = phoneNumber;
    }

    public void PrintInfo() {
        System.out.printf("Employee %s of department %s has phone number %s\n", this.FullName, this.Department, this.PhoneNumber);
    }
}
