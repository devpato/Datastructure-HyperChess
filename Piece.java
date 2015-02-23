
public abstract class Piece {

	protected Node at;
	protected String team;
	public Piece(Node node){
		at = node;
	}
	abstract boolean canMoveTo(Node node);
	abstract boolean moveTo(Node node);
	public String toString(){
		String result = "";
		if(team.equals("black")){
			team = "B";
		}
		else{
			team = "W";
		}
		return result;
	}

}
