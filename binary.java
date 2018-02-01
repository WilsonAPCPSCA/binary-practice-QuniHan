import java.util.Scanner;
public class binary {
public static void binaryConverter(int x){
	 int result=0;
	 if ((x-128)>=0){
		 	result=result+10000000;
		 	x=x-128;
	 }
	 if ((x-64)>=0){
			result=result+1000000;
			x=x-64;
	 }
	 if ((x-32)>=0){
			result=result+100000;
			x=x-32;
	 }
	 if ((x-16)>=0){
			result=result+10000;
			x=x-16;
	 }
	 if ((x-8)>=0){
			result=result+1000;
			x=x-8;
	 }
	 if ((x-4)>=0){
			result=result+100;
			x=x-4;	 
	 }
	 if ((x-2)>=0){
			result=result+10;
			x=x-2;	 
	 }
	 if ((x-1)>=0){
			result=result+1;
			x=x-1;
	 }
	 if (result<10){
		 System.out.print("0000000"+result);	 
	 }
	 else if (result<100){
		 System.out.print("000000"+result);	 
	 }
	 else if (result<1000){
		 System.out.print("00000"+result);	 
	 }
	 else if (result<10000){
		 System.out.print("0000"+result);	 
	 }
	 else if (result<100000){
		 System.out.print("000"+result);	 
	 }
	 else if (result<1000000){
		 System.out.print("00"+result);	 
	 }
	 else if (result<10000000){
		 System.out.print("0"+result);	 
	 }
	 else{
		 System.out.print(result);
	 }
	
	 
}
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("enter a number: ");
		int num= in.nextInt();
		binaryConverter(num);

	}

}
