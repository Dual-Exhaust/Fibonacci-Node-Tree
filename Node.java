
public class Node {
	private Node left = null;
	private Node right = null;
	private boolean hasChildren = false;
	private static int NODE_COUNT=0;
	private static int NODES_WITHOUT_CHILDREN=0;
	private static int RECURSIVE_TOTAL=0;
	
	public Node(int n)
	{
		NODE_COUNT++;
		//Shows where specifically in memory this exact node is stored
		System.out.println("Node " + NODE_COUNT + " Created: " + this.toString());
		if(n>2)
		{
			hasChildren = true;
			left = new Node(n-1);
			right = new Node(n-2);
		}
		//If a node has children (it will always have two children if so) it will display which nodes in memory they are
		if(this.hasChild())
		{
			System.out.println("Node: " + this.toString() + " has children: " + this.getChildren());
		}
		
	}
	public Node getLeft()
	{
		return left;
	}
	public Node getRight()
	{
		return right;
	}
	public static int getNODE_COUNT() {
		return NODE_COUNT;
	}
	public static int getNODES_WITHOUT_CHILDREN() {

		return NODES_WITHOUT_CHILDREN;
	}
	public static int getRECURSIVE_TOTAL() {
		return RECURSIVE_TOTAL;
	}
	public boolean hasChild()
	{
		return hasChildren;
	}
	public String getChildren()
	{
		return this.getLeft().toString() + " " + this.getRight().toString();
	}
	public boolean addUp(boolean f)
	{
		//keeps track of how many times this method is called. It should always equal the number of nodes created.
		RECURSIVE_TOTAL++;
		if(f)
		{
			//Calls when the specific node has children and the method must run again
			//System.out.println("Calling to addUp.");
			this.getLeft().addUp(this.getLeft().hasChild());
			this.getRight().addUp(this.getRight().hasChild());
			return true;
		}
		else
		{
			//Calls when a node has no children and can add one to the answer
			//System.out.println("Adding to total.");
			NODES_WITHOUT_CHILDREN++;
			return false;
		}
	}

	


}
