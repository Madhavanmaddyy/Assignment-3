package week2.day1;

public class EmployeeDetails {
	public void printEmployeeName(String empName,int empId) {
		System.out.println("employee name:"+empName);
		System.out.println("employee id:"+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("empAddress:"+empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("emp salary:"+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("emp mobile num:"+mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.printEmployeeName("ram",37674464);
		emp.getEmployeeAddress("Chennai");
		emp.printEmployeeSalary(15000.05);
		emp.printEmployeeMobileNumber(9837387832L);
		
	}
	

}
