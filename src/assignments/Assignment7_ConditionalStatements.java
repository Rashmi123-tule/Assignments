package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		    int creditScore = 720 ;
	        double income = 55000.0;
	        boolean isEmployed = true;
	        double  debToIncomeRatio = 35.0;

	        if(creditScore > 750){
	            System.out.println("loan approved");
	        }
	        else if(creditScore >= 650 && creditScore <= 750)
	        {
	            if(income >= 50000.0 && isEmployed)
	            {
	                if(debToIncomeRatio <= 40.0){
	                    System.out.println("loan approved due to low dti ratio and employed");
	                }
	                else{
	                    System.out.println("loan denied due to high sti ratio");
	                }
	            }
	            else{
	                System.out.println("income is less than the criteria and not employed");
	            }
	        }
	        else {
	            System.out.println("loan denied beacuse creditscore low and creditScore not in between the criteria");
	        }
	}

}
