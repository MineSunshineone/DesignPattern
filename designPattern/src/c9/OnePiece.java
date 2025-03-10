package c9;

public class OnePiece extends APiece {

    public OnePiece(String inKind) {
        super(inKind);
    }

    @Override
    public void play(int x, int y) {
        System.out.println("放置" + inKind + "到(" + x + ", " + y + ")");
    }
}
