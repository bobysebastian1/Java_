package project;
import java.util.Scanner;
public class arithmeticCalculator {

	public static void main(String[] args) {
		char operator;
		double FIRSTNUMBER,SECONDNUMBER,RESULT;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER:");
		FIRSTNUMBER = sc.nextInt();
		System.out.println("CHOOSE THE OPERATOR NUMBER/SYMBOL:\n 1,+ --> ADDITION \n 2,- --> SUBSTRACTION \n 3,* --> MULTIPLICATION \n 4,/ --> DIVISION ");
	    operator = sc.next().charAt(0);
		System.out.println("ENTER THE SECOND NUMBER:");
		SECONDNUMBER = sc.nextInt();
		
		
		 switch (operator) {

	      // performs addition between numbers
	      case '1','+':
	    	  RESULT = FIRSTNUMBER + SECONDNUMBER ;
	        System.out.println(FIRSTNUMBER + " + " + SECONDNUMBER + " = " +RESULT);
	        break;

	      // performs subtraction between numbers
	      case '2','-':
	    	  RESULT = FIRSTNUMBER - SECONDNUMBER;
	        System.out.println(FIRSTNUMBER + " - " + SECONDNUMBER + " = " + RESULT);
	        break;

	      // performs multiplication between numbers
	      case '3','*':
	    	  RESULT = FIRSTNUMBER * SECONDNUMBER;
	        System.out.println(FIRSTNUMBER + " * " + SECONDNUMBER + " = " + RESULT);
	        break;

	      // performs division between numbers
	      case '4','/':
	    	  RESULT = FIRSTNUMBER / SECONDNUMBER;
	        System.out.println(FIRSTNUMBER + " / " + SECONDNUMBER + " = " + RESULT);
	        break;

	      default:
	        System.out.println("!!! INVALID OPERATOR NUMBER/SYMBOL !!! ENTER CORRECT OPERATORS !!!");
	       
	    }

	    
		

	}

}
