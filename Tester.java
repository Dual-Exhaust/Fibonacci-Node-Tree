import java.util.Scanner;
public class Tester {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What number in the Fibonacci Sequence would you like?");
		Node x = new Node(in.nextInt());
		x.addUp(x.hasChild());
		System.out.println("Answer: " + x.getNODES_WITHOUT_CHILDREN());
		System.out.println("Total Nodes Created: " + x.getNODE_COUNT());
		System.out.println("Total Times Recursed: " + x.getRECURSIVE_TOTAL());
		in.close();
	}

}
