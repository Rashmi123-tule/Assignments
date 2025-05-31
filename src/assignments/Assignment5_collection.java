package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Map<String, String>> studentDetails = new ArrayList<>();
		 List<Map<String, String>> employeDetails = new ArrayList<>();
		 List<Map<String, String>> productDetails = new ArrayList<>();

	        Map<String, String> student1 = new HashMap<>();
	        student1.put("name", "John Doe");
	        student1.put("age", "Twenty");
	        student1.put("gender", "Male");
	        student1.put("rollno", "SBA12345");
	        student1.put("grade", "A++");
	        student1.put("major", "Computer Science");
	        student1.put("gpa", "3.8");
	        student1.put("panno", "SDF6543210");
	        student1.put("email", "john@example.com");
	        student1.put("address", "123 Elm St");

	        Map<String, String> student2 = new HashMap<>();
	        student2.put("name", "Jane Smith");
	        student2.put("age", "Twenty One");
	        student2.put("gender", "Female");
	        student2.put("rollno", "SBA12346");
	        student2.put("grade", "B+");
	        student2.put("major", "Mathematics");
	        student2.put("gpa", "3.5");
	        student2.put("panno", "REW6543211");
	        student2.put("email", "jane@example.com");
	        student2.put("address", "456 Oak St");

	        Map<String, String> student3 = new HashMap<>();
	        student3.put("name", "Jake Smith");
	        student3.put("age", "Twenty Two");
	        student3.put("gender", "Male");
	        student3.put("rollno", "SBA12347");
	        student3.put("grade", "B+");
	        student3.put("major", "Physics");
	        student3.put("gpa", "3.7");
	        student3.put("panno", "REW6543212");
	        student3.put("email", "jake@example.com");
	        student3.put("address", "457 Oak St");

	        
	        studentDetails.add(student1);
	        studentDetails.add(student2);
	        studentDetails.add(student3);
	        
	        System.out.println(studentDetails);
	    
	        
	        Map<String, String> emp1 = new HashMap<>();
	        emp1.put("employeeId", "E001");
	        emp1.put("name", "Alice Green");
	        emp1.put("age", "Thirty");
	        emp1.put("gender", "Female");
	        emp1.put("department", "Engineering");
	        emp1.put("position", "Software Engineer");
	        emp1.put("salary", "75K Pounds");
	        emp1.put("email", "alice@example.com");
	        emp1.put("panno", "SDF6543210");
	      

	        Map<String, String> emp2 = new HashMap<>();
	        emp2.put("employeeId", "E002");
	        emp2.put("name", "Bob Johnson");
	        emp2.put("age", "Thirty Five");
	        emp2.put("gender", "Male");
	        emp2.put("department", "Marketing");
	        emp2.put("position", "Marketing Manager");
	        emp2.put("salary", "85K Pounds");
	        emp2.put("email", "bob@example.com");
	        emp2.put("panno", "SDF6543210");
	        

	        Map<String, String> emp3 = new HashMap<>();
	        emp3.put("employeeId", "E003");
	        emp3.put("name", "Carol White");
	        emp3.put("age", "Twenty Eight");
	        emp3.put("gender", "Female");
	        emp3.put("department", "Sales Executive");
	        emp3.put("position", "Sales");
	        emp3.put("salary", "95K Pounds");
	        emp3.put("email", "coral@example.com");
	        emp3.put("panno", "REW6543212");
	        
	        employeDetails.add(emp1);
	        employeDetails.add(emp2);
	        employeDetails.add(emp3);
	        
	        System.out.println(employeDetails);
	        
	        
	  	  Map<String, String> product1 = new HashMap<>();
		  product1.put("productId", "John Doe");
		  product1.put("name", "Laptop");
		  product1.put("category", "electronic");
		  product1.put("price", "12kpound");
		  product1.put("stockquantity", "not available");
		  product1.put("supplier", "tech supplies");
		  product1.put("warranty", "2years");
		  product1.put("rating", "4.5 star");
		  product1.put("manifacturingdate", "2023 aug");
		  product1.put("expirydate", "2028 aug");

	      Map<String, String> product2 = new HashMap<>();
	      product2.put("productId", "Jane Smith");
	      product2.put("name", "Desk Chair");
	      product2.put("category", "furniture");
	      product2.put("price", "150kpound");
	      product2.put("stockquantity", "two");
	      product2.put("supplier", "office Depot");
	      product2.put("warranty", "1year");
	      product2.put("rating", "4 star");
	      product2.put("manifacturingdate", "sep 2028");
	      product2.put("expirydate", "N/A");

	      Map<String, String> product3 = new HashMap<>();
	      product2.put("productId", "Jake Smith");
	      product2.put("name", "Coffee Maker");
	      product2.put("category", "kitchen");
	      product2.put("price", "72kpound");
	      product2.put("stockquantity", "two hundred");
	      product2.put("supplier", "kitchen");
	      product2.put("warranty", "4 year");
	      product2.put("rating", "2 star");
	      product2.put("manifacturingdate", "july 2023");
	      product2.put("expirydate", "june 2028");

	      
	      productDetails.add(product1);
	      productDetails.add(product2);
	      productDetails.add(product3);
	      
	      System.out.println(productDetails);
	      
	      
	    
	      Map<String, List<Map<String, String>>> allDetails = new HashMap<>();
	      allDetails.put("studentDetails", studentDetails);
	      allDetails.put("employeeDetails", employeDetails);
	      allDetails.put("productDetails", productDetails);
	      
	      System.out.println(allDetails);
	      
	}
    

  
}
