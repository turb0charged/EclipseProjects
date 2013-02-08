import java.util.Scanner;
public class RabbitsBornForValue {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int months=0;
		System.out.println("Please input amount of months to see rabbits born: ");
		months=scan.nextInt();
		
		System.out.println("Amount of rabbits born is: " +rabbit(months));
	}
	public static int rabbits(int n){
		if(n==1||n==2)
			return 1;
		return rabbits(n-1)+rabbits(n-2);
	}
}
