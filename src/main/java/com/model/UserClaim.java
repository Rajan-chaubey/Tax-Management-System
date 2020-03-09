package com.model;
 
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
 
import org.springframework.stereotype.Component;
 
@Component
public class UserClaim {
 
	private String expenseType;
 
	@NotNull(message = "{error.expenseAmount}")
	@DecimalMin(value = "0.0", message = "{error.expenseAmount.negative}")
	private double expenseAmt;
 
	@NotEmpty(message = "{error.employeeId}")
	private String employeeId;
 
 
	public String getExpenseType() {
		return expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}
 
	public double getExpenseAmt() {
		return expenseAmt;
	}
	public void setExpenseAmt(double expenseAmt) {
		this.expenseAmt = expenseAmt;
	}
 
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
 
}
 
 