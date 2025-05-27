package assignments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees emp = new Employees();
		
		String [] employeeName = new String[3];
		int [] employeeIds = new int[3];
		
	       employeeName[0] = emp.empName1 ;
	       employeeName[1] = emp.empName2 ;
	       employeeName[2] = emp.empName3 ;
	       
	       employeeIds[0] = emp.empId1 ;
	       employeeIds[1] = emp.empId2 ;
	       employeeIds[2] = emp.empId3 ;
	       
	       
	       System.out.printf("Employee Name:" + employeeName[0] + "Employee Ids:" + employeeIds[0]);
	       System.out.printf("Employee Name:" + employeeName[1] + "Employee Ids:" + employeeIds[1]);
	       System.out.printf("Employee Name:" + employeeName[2] + "Employee Ids:" + employeeIds[2]);
	           
	       

	};

}
