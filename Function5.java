/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 11/30/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */




public class Function5 extends Function {

	@Override
	public double fnValue(double x) {
		return Math.sin(1/x);
	}
	
	public String toString() {
		return "sin(1/x)";
	}

}
