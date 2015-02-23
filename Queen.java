
public class Queen extends Piece {
	public Queen(String color){
                this(color, new Node());
        }
        public Queen(String color,Node node){
                super(node);
                color = color.toLowerCase();
                if(!color.equals("black") || !color.equals("white")){
                        throw new NullPointerException("You didn't enter a correct color");
                }
                this.team = color;
        }
        @Override
        boolean canMoveTo(Node node) {
                return false;
        }
        @Override
        boolean moveTo(Node node) {
                return false;
        }
	public String toString(){
                String result = "";
                result = "Queen" +" "+ this.team;
                return result;
        }
}
