import java.util.Scanner;
public class EVEN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Put in a number");
int number = input.nextInt();
String a = evenNumber(number);
System.out.println(a);
	}
	public static String evenNumber(int num) {
		if ((num%2) == 0) {
			return "Even";
		}else {
			return "Odd";
		}
		}
	}

