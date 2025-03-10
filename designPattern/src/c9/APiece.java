package c9;

public abstract class APiece {
    protected String inKind;

    public APiece(String inKind) {
        this.inKind = inKind;
    }
    // 下棋落子的位置
    public abstract void play(int x, int y);
}
