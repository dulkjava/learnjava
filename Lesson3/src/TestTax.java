class TestTax {
	public static void main(String[] args) {
		Tax t = new NJTax(); // creating an instanceProgram Comments ❘ 25
		t.grossIncome = 29000; // assigning the values
		t.dependents = 2;
		t.state = "NJ";
		double yourTax = t.calcTax(); // calculating tax
		// Printing the result
		System.out.println("Your tax is " + yourTax);
	}
}