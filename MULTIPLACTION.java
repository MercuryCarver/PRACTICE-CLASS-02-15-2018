import java.util.Scanner;
public class MULTIPLACTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner math = new Scanner(System.in);
System.out.println("Put in two numbers to be multiplied");
int number1 = math.nextInt();
int number2 = math.nextInt();
int a = multiplication(number1,number2);
System.out.println(a);
	}
		public static int multiplication(int num1, int num2) {
			int product = num1 * num2;
			return product;
		}
}
