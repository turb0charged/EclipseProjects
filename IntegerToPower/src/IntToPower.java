import java.util.Scanner;
public class IntToPower {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int number;
		int power;
		
		System.out.println("Please input the integer and the power you would like to see it raised to:");
		number=scan.nextInt();
		power=scan.nextInt();
		
		System.out.println(number+ " raised to the "+power+" is "+topowerRecursive(number,power)+" recursive solution.");
		System.out.println(number+ " raised to the "+power+" is "+topowerIterative(number,power)+" iterative solution.");
		
		
	}
	public static int topowerRecursive(int num, int pow){
		if(pow==0)
			return 1;
		return num*topowerRecursive(num,pow-1);
	}
	public static int topowerIterative(int num, int pow){
		int val=num;
		for(int i=1;i<pow;i++)
			val*=num;
		return val;
	}
}
