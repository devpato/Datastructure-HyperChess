public class Node
{
	private Piece piece;
	private Node at;
	private Node left;
	private Node right;
	private Node up;
	private Node down;
	private Node in;
	private Node out;

	public Node()
	{
		piece = null;
	}

	public Node(Piece piece)
	{
		this.piece = piece;
	}
	public Piece getPiece()
	{
		return piece;
	}

	public Node getLeft()
	{
		return left;
	}
	public Node getRight()
	{
		return right;
	}
	public Node getUp()
	{
		return up;
	}
	public Node getDown()
	{
		return down;
	}
	public Node getIn()
	{
		return in;
	}
	public Node getOut()
	{
		return out;
	}
	public Node getAt()
	{
		return at;
	}
	public Piece setPiece(Piece piece)
	{
		return this.piece = piece;
	}
	public Node setAt(Node at)
	{
		return this.at = at;
	}
	public Node setLeft(Node left)
	{
		return this.left = left;
	}
	public Node setRight(Node right)
	{
		return this.right = right;
	}
	public Node setUp(Node up)
	{
		return this.up = up;
	}
	public Node setDown(Node down)
	{
		return this.down = down;
	}
	public Node setIn(Node in)
	{
		return this.in = in;
	}
		public Node setOut(Node out)
	{
		return this.out = out;
	}
	

}
