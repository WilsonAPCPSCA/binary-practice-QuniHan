import java.util.Scanner;
public class binary {
public static void binaryConverter(int x){
	 String result="";
	 int y= (int)(Math.log(x)/Math.log(2));
	 for (int i=y; i>=0 ;i--){
		 
		 if (x-Math.pow(2,i)>=0){
			 result += "1";		 
			 x=(int)(x-Math.pow(2,i));
			 
		 }
		 else result+="0";
	 }

	 System.out.print(result);	
}
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("enter a number: ");
		int num= in.nextInt();
		binaryConverter(num);

	}

}
