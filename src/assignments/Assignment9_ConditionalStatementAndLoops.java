package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment9_ConditionalStatementAndLoops {
	 double variablePay;
	 double rating;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Map<String, String>> employeeDetails = new ArrayList<>();
		 
		 Map<String, String> emp1 = new HashMap<>();
			 emp1.put("name", "Alice Johnson");
			 emp1.put("basesalary", "75000.0");
			 emp1.put("yearexperience", "5.1");
			 emp1.put("yearendrating", "4.2");
			 
	    Map<String, String> emp2 = new HashMap<>();
		    emp2.put("name", "Bob Smith");
		    emp2.put("basesalary", "68000.0");
		    emp2.put("yearexperience", "3.2");
		    emp2.put("yearendrating", "3.8");
	   
		    
	    Map<String, String> emp3 = new HashMap<>();
		    emp3.put("name", "Carol Davis");
		    emp3.put("basesalary", "82000.0");
		    emp3.put("yearexperience", "7.1");
		    emp3.put("yearendrating", "4.5");
		    
	    Map<String, String> emp4 = new HashMap<>();
		    emp4.put("name", "David Brown");
		    emp4.put("basesalary", "90000.0");
		    emp4.put("yearexperience", "10.2");
		    emp4.put("yearendrating", "2.5");
		    
	    Map<String, String> emp5 = new HashMap<>();
	    emp5.put("name", "Eva Green");
	    emp5.put("basesalary", "60000.0");
	    emp5.put("yearexperience", "2.4");
	    emp5.put("yearendrating", "3.5");
	    
	    employeeDetails.add(emp1);
	    employeeDetails.add(emp2);
	    employeeDetails.add(emp3);
	    employeeDetails.add(emp4);
	    employeeDetails.add(emp5);
	    
	    System.out.println(employeeDetails);
	    
	    
	    double variablePayPercent = 0;
	    for(Map <String, String> emp:employeeDetails) {
	    	System.out.println(emp);
	    	
	    	String name = emp.get("name");
	    	double basesSalary  = Double.parseDouble(emp.get("basesalary"));
	    	double yearExperience = Double.parseDouble(emp.get("yearexperience"));
	    	double yearEndrating = Double.parseDouble(emp.get("yearendrating"));
	    	
	    	short rewards = 0;
	    	short bonus = 0;
	    	
	    	if(yearExperience >= 5) {
	    		rewards = 5000;
	    	}
	    	if(yearEndrating >= 4.0) {
	    		variablePayPercent = 15.0;
	    		bonus = 1500;
	    	}
	    	if(yearEndrating >=3 && yearEndrating < 4 ) {
	    		variablePayPercent = 10.0;
	    		bonus = 1200;
	    	}
	    	if(yearEndrating < 3.0) {
	    		variablePayPercent = 3.0;
	    		bonus = 300;
	    	}
	        
	        double variablePay = basesSalary * variablePayPercent;
           
            double hikeAmount = variablePay + bonus + rewards;
            double hikePercentage = (hikeAmount / basesSalary) * 100;

	    	System.out.println(hikePercentage);
	    	
	    	
	    	List<Map<String, Double>> data = new ArrayList<>();
	    	
	    	
	    }
	    
	}
  
     
}
