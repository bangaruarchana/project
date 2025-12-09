package p1;

public class Program1 {
public static void main(String[] args) {
	int a=20;
	int b=40;
	System.out.println("Before Swapping");
	System.out.println("Before Swapping value of a is :" + a);
	System.out.println("Before Swapping value of b is :" + b);
	
	System.out.println();
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After Swapping");
	System.out.println("After Swapping value of a is :" + a);
	System.out.println("After Swapping value of b is :" +b);

}
}
