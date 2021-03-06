// Hector Castillo
// Prof. D. Orden
// Data Structures
import java.util.Scanner;
public class FiveDigits {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int value1;
		int value2;
		int value3;
		
		System.out.println("Please input a positive 5 digit integer.");
		value1=scan.nextInt();
		System.out.println("Would you like to print the number spaced out forward(1) or backward(2)?");
		value2=scan.nextInt();
		System.out.println("Would you like to do this recursively(1) or iteratively(2)?");
		value3=scan.nextInt();
		
		if(value3==1){
			if(value2==1){
				System.out.println("This is the interger spaced out forward: ");
				forwardDigit(value1);
			}
			else{ 
				System.out.println("This is the interger spaced out backward: ");
				backwardDigit(value1);
			}
		}
		else{
			if(value2==1){
				System.out.println("This is the interger spaced out forward: ");
				forwardDigitIterative(value1);
			}
			else{ 
				System.out.println("This is the interger spaced out backward: ");
				backwardDigitIterative(value1);
			}
		}
	}
	public static void forwardDigit(int digit){
		if(digit/10==0)
			System.out.print(digit);
		else{ 
			forwardDigit(digit/10);
			System.out.print(digit%10+" ");
		}
	}
	public static void backwardDigit(int digit){
		if(digit/10==0)
			System.out.print(digit);
		else{
			System.out.print(digit%10+" ");
			backwardDigit(digit/10);
		}
	}
	public static void forwardDigitIterative(int digit){
		int holder=digit;
		int place=10000;
		for(int i=1;i<=5;i++){
			System.out.print(holder/place+" ");
			holder=holder%place;
			place=place/10;
		}
	}
	public static void backwardDigitIterative(int digit){
		int holder=digit;
		for(int i=1;i<=5;i++){
			System.out.print(holder%10+" ");
			holder=holder/10;
		}
	}
}
