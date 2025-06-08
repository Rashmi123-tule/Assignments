package assignments;

public class Assignment10_ArrayAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//		int [] number = {12,34,11,36,87,98,93};
//
//		
//	     for(int i=0; i < number.length ; i++) {
//	    	 for(int j = i+1; j < number.length; j++) {
//	    		 if (number[i] < number[j]) {
//	                    // Swap
//	                    int temp = number[i];
//	                    number[i] = number[j];
//	                    number[j] = temp;
//	                }
//	    	 }
//	     }
//	     
//	     System.out.println("1st Largest: " + number[0]);
//         System.out.println("2nd Largest: " + number[1]);
//         System.out.println("3rd Largest: " + number[2]);
		
		int [] number = {1,2,3,4,5};
		
		for(int i=0; i<number.length; i++) {
			if(number[i] == 1) {
				System.out.println(number[i]);
			}
			else if(number[i] ==1 && number[i] == 2) {
				System.out.println(number[i]);
			}
		}
}
		
}

