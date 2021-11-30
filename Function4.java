/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 11/30/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */




public class Function4 extends Function {

	@Override
	public double fnValue(double x) {
		return (Math.pow(x,3) - (7*Math.pow(x,2)) + 15*x - 9);
	}
	
	public String toString () {
		return "x^3 - 7*x^2 + 15*x - 9";
	}

}
