
public class King extends Piece {
	public King(String color){
                this(color, new Node());
        }
        public King (String color,Node node){
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
                result = "King" +" "+ this.team;
                return result;
        }
}
