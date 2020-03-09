%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://w...content-available-to-author-only...k.org/tags"%>
<%@ taglib prefix="form" uri="http://w...content-available-to-author-only...k.org/tags/form"%>
<%@ taglib uri="http://w...content-available-to-author-only...k.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://j...content-available-to-author-only...n.com/jsp/jstl/core"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://w...content-available-to-author-only...3.org/TR/html4/loose.dtd">
<html>
 
<body style="background-color: lavender">
	<h1>
		<center>TMS: Tax Claim</center>
	</h1>
 
	<a href="/getTaxClaimFormPage?language=en">English</a>|
	<a href="/getTaxClaimFormPage?language=de">German</a>|
	<a href="/getTaxClaimFormPage?language=fr">French</a>
	<!-- </align> -->
 
	<form:form method="get" action="/calculateTax" 	modelAttribute="userClaim">
 
		<table>
 
			<tr>
				<td id="id1"><label><spring:message code="label.employeeId" /></label></td>
				<td id="id2"><form:input path="employeeId" name="employeeId" /></td>
				<td id="id3"><form:errors path="employeeId"><spring:message code="error.employeeId"/></form:errors></td>
			</tr>
 
			<tr>
				<td id="id4"><label><spring:message code="label.expenseType" /></label></td>
				<td id="id5"><form:select path="expenseType" items="${expenseList}" name="expenseType" /></td>
				<td id="id6"></td>
			</tr>
 
			<tr>
				<td id="id7"><label><spring:message code="label.expenseAmount" /></label></td>
				<td id="id8"><form:input path="expenseAmt" name="expenseAmount" /></td>
				<td id=id9><form:errors path="expenseAmt"><spring:message code="error.expenseAmount" /><br></form:errors>
									<form:errors path="expenseAmt"><spring:message code="error.expenseAmount.numeric" /><br></form:errors>
									<form:errors path="expenseAmt"><spring:message code="error.expenseAmount.negative" /><br></form:errors>
				</td>
			</tr>
 
			<tr>
				<td><input type="Submit" name="calculateClaim" value="Calculate Claim" /></td>
				<td><input type="reset" name="reset" value="Clear" /></td>
			</tr>
 
			<!-- <tr>
				<td><input type="reset" name="reset" value="Clear" /></td>
				<td></td>
			</tr> -->
 
		</table>
	</form:form>
 
</body>