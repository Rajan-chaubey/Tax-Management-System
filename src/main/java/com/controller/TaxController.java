package com.controller;
 
import java.util.ArrayList;
import java.util.List;
 
import javax.validation.Valid;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.model.UserClaim;
import com.service.TaxService;
 
@Controller
public class TaxController {
 
	@Autowired
	private TaxService taxService;
 
	@RequestMapping(value = "/getTaxClaimFormPage", method = RequestMethod.GET)
	public String discountPage(@ModelAttribute("userClaim") UserClaim userClaim) {
		userClaim = new UserClaim();
 
		return "taxclaim";
	}
 
	@RequestMapping(value = "/calculateTax", method = RequestMethod.GET)
	public String calculateTax(@ModelAttribute("userClaim") @Valid UserClaim userClaim, BindingResult result,ModelMap map) {
 
		if (result.hasErrors()) {
			return "taxclaim";
		}
 
		double totalTax = taxService.calculateTax(userClaim);
		map.addAttribute("taxClaimAmount", totalTax);
 
		map.addAttribute("expenseType",userClaim.getExpenseType());
		map.addAttribute("expenseAmount", userClaim.getExpenseAmt());
 
		return "result";
	}
 
	@ModelAttribute("expenseList")
	public List<String> populateExpense() {
 
		List<String> expenseList = new ArrayList<String>();
		expenseList.add("MedicalExpense");
		expenseList.add("TravelExpense");
		expenseList.add("FoodExpense");
 
		return expenseList;
	}
 
}
 
 