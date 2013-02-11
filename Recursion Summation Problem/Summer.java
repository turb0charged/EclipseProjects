public class Summer{
	private int num;
	public Summer(int newNumber){
		num=newNumber;
	}
	public static int sum(int num){
		int result;
		if(num==1){
				result=1;
				System.out.println(result);
		}
		else{
			result=num+sum(num-1);
			System.out.println(result);
		}
		return result;
	}
}