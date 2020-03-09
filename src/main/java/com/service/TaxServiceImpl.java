package com.service;
 
import org.springframework.stereotype.Service;
 
import com.model.UserClaim;
 
@Service
public class TaxServiceImpl implements TaxService{
 
	@Override
	public double calculateTax(UserClaim userClaim) {
 
		String expenseType = userClaim.getExpenseType();
		double expense = userClaim.getExpenseAmt();
		double taxPercent = 0.0;
 
		if(expenseType.equalsIgnoreCase("MedicalExpense")) {
			if(expense>=0 && expense<=1000) {
				taxPercent = 15;
			}
			else if(expense>=1001 && expense<=10000) {
				taxPercent = 20;
			}
			else if(expense>10000) {
				taxPercent = 25;
			}
		}
		else if(expenseType.equalsIgnoreCase("TravelExpense")) {
			if(expense>=0 && expense<=1000) {
				taxPercent = 10;
			}
			else if(expense>=1001 && expense<=10000) {
				taxPercent = 15;
			}
			else if(expense>10000) {
				taxPercent = 20;
			}
		}
		else if(expenseType.equalsIgnoreCase("FoodExpense")){
			if(expense>=0 && expense<=1000) {
				taxPercent = 5;
			}
			else if(expense>=1001 && expense<=10000) {
				taxPercent = 10;
			}
			else if(expense>10000) {
				taxPercent = 15;
			}
		}
 
		//Tax claim amount = Expense amount * (Tax percentage /100)
		double totalTax = expense * (taxPercent/100) ; 
 
		return totalTax;
	}
 
}
 
 
 