package assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assinment8_ConditonalStatementsAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		List<Integer> transactions = new LinkedList<Integer>();
		
		transactions.add(50000);
		transactions.add(-2000);
		transactions.add(3000);
		transactions.add(-15000);
		transactions.add(-200);
		transactions.add(-300);
		transactions.add(4000);
		transactions.add(-3000);
		
		System.out.println(transactions);
//		System.out.println(transactions[0]);
		
		int creditCount = 0;
		int debitCount = 0;
		int totalAmountCredited = 0;
		int totalAmountDebited = 0;
		
		for(int amount:transactions) {
			if(amount>0) {
				creditCount++;
				totalAmountCredited += amount;
				
			}
			else {
				debitCount++;	
				totalAmountDebited += Math.abs(amount);
			}
			
		}  
		System.out.println("Total number of credit:" + creditCount);
		System.out.println("Total number of debit:" + debitCount);
		System.out.println("Total amount of credit:" + totalAmountCredited);
		System.out.println("Total amount of credit:" + totalAmountDebited);
		System.out.println("Total amount remaining at the end is :" + 0);
		
	}
}
