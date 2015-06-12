<!-- 본문 시작 -->
<div id="test">
<h1>환영합니다.</h1>
<form name="loandata">
<table>
	<tr><th>Enter Loan Data:</th>
	<td></td>
	<tr><td>Amount of the loan ($):</td>
	<td><input type="text" name="amount" onchange="calculate();"></td>
	<td rowspan=8>
	<tr><td>Annual interest (%):</td>
	<td><input type="text" name="interest" onchange="calculate();"></td></tr>
	<tr><td>Repayment period (years):</td>
	<td><input type="text" name="years" onchange="calculate();"></td>
	<tr><th>Approximate Payments:</th>
	<td><button onclick="calculate();">Calculate</button></td></tr>
	<tr><td>Monthly payment:</td>
	<td>$<span class="output" id="payment"></span></td></tr>
	<tr><td>Total payment:</td>
	<td>$<span class="output" id="total"></span></td></tr>
	<tr><td>Total interest:</td>
	<td>$<span class="output" id="totalinterest"></span></td></tr>
</table>
</form>

<script>
/*
* This script defines the calculate() function called by the event handlers
* in HTML above. The function reads values from <input> elements, calculates
* loan payment information, displays the results in <span> elements. It also
* saves the user's data, displays links to lenders, and draws a chart.
*/
function calculate() {
	// Look up the input and output elements in the document
	var amount = document.loandata.amount.value();
	var interest = document.loandata.interest.value(); / 100 / 12;
	var years = document.loandata.years.value();;
	var payments = years * 12;
	
	document.write("amount: " + amount);
	// Get the user's input from the input elements. Assume it is all valid.
	// Convert interest from a percentage to a decimal, and convert from
	// an annual rate to a monthly rate. Convert payment period in years
	// to the number of monthly payments.
	// Now compute the monthly payment figure.
	var x = Math.pow(1 + interest, payments); // Math.pow() computes powers
	var monthly = (amount*x*interest)/(x-1);
	
	var payment = document.getElementById("payment");
	var total = document.getElementById("total");
	var totalinterest = document.getElementById("totalinterest");
	// If the result is a finite number, the user's input was good and
	// we have meaningful results to display
	if (isFinite(monthly)) {
	// Fill in the output fields, rounding to 2 decimal places
		payment.innerHTML = monthly.toFixed(2);
		total.innerHTML = (monthly * payments).toFixed(2);
		totalinterest.innerHTML = ((monthly*payments)-amount).toFixed(2);
		// Save the user's input so we can restore it the next time they visit
		//save(amount.value, interest.value, years.value);
		// Advertise: find and display local lenders, but ignore network errors
		//try { // Catch any errors that occur within these curly braces
			//getLenders(amount.value, interest.value, years.value);
		//}
		//catch(e) { /* And ignore those errors */ }
			// Finally, chart loan balance, and interest and equity payments
		//chart(amount, interest, monthly, payments);
	}
	else { 
		// Result was Not-a-Number or infinite, which means the input was
		// incomplete or invalid. Clear any previously displayed output.
		payment.innerHTML = ""; // Erase the content of these elements
		total.innerHTML = ""
		totalinterest.innerHTML = "";
		//chart(); // With no arguments, clears the chart
	}
}
</div>
<!--  본문 끝 -->