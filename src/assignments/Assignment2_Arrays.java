package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [] semister = {"sem1","sem2","sem3","sem4","sem5"};
        System.out.println(semister);
        
        String[] subjects = {
        	    "Mathematics I",
        	    "Physics",
        	    "Chemistry",
        	    "Computer Programming",
        	    "Engineering Drawing",
        	    "Basic Electrical Eng.",
        	    "Mathematics II",
        	    "Mechanics",
        	    "Environmental Science",
        	    "Basic Electronics",
        	    "Engineering Physics",
        	    "Engineering Graphics",
        	    "Data Structures",
        	    "Discrete Mathematics",
        	    "Digital Electronics",
        	    "Operating Systems",
        	    "Signals and Systems",
        	    "Object-Oriented Programming",
        	    "Algorithms",
        	    "Computer Networks",
        	    "Database Systems",
        	    "Microprocessors",
        	    "Communication Engineering",
        	    "Software Engineering",
        	    "Probability & Statistics",
        	    "Machine Learning",
        	    "Compiler Design",
        	    "Theory of Computation",
        	    "Embedded Systems",
        	    "Computer Graphics"
        	};
       
       String[] statusMarks = {
    		    "Pass(78)",
    		    "Pass(85)",
    		    "Fail(21)",
    		    "Pass(74)",
    		    "Pass(88)",
    		    "Pass(79)",
    		    "Pass(82)",
    		    "Pass(77)",
    		    "Pass(93)",
    		    "Fail(19)",
    		    "Fail(24)",
    		    "Pass(90)",
    		    "Pass(88)",
    		    "Pass(81)",
    		    "Pass(76)",
    		    "Fail(32)",
    		    "Pass(85)",
    		    "Pass(78)",
    		    "Pass(91)",
    		    "Pass(73)",
    		    "Fail(19)",
    		    "Pass(80)",
    		    "Pass(76)",
    		    "Pass(87)"
    		}; 
       
       String [] [] subMarks = {subjects,statusMarks};
       for (int i = 0; i < subMarks.length; i++) {
    	    System.out.println("Subject: " + subMarks[i][0] + ", Status/Marks: " + subMarks[i][1]);
    	}
	}

}
