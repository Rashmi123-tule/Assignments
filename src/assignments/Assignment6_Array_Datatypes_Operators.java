package assignments;

public class Assignment6_Array_Datatypes_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name = {"Suresh","Mahesh","Naresh"};
        int [] marks = {75,80,82};
        
        int mark1 = marks[0] + 10 ;
        int mark2 = marks[1] + 10;
        int mark3 = marks[2] + 10;
        System.out.println(mark1);
        System.out.println("updated marks:"+ name[0] + ":" + mark1 + name[1] + ":" + mark2 + name[2] + ":" + mark3);
        
        int sumMarks =  mark1 + mark2 + mark3 ; 
        int avergaMarks = sumMarks/3 ;
        System.out.println(avergaMarks);
	}

}
