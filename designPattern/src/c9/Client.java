package c9;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random rm = new Random();
        PieceFactory pf = new PieceFactory();
        for (int x = 0; x < 19; x++) {
            for (int y = 0; y < 19; y++) {
                APiece p;
                if (rm.nextInt()%2 ==0) {
                    p = pf.getAPiece("白棋");
                }
                else
                    p = pf.getAPiece("黑棋");
                p.play(rm.nextInt(19), rm.nextInt(19));
            }
        }

        System.out.println("一共绘制了" + pf.getNumPieces() + "种棋子");
    }
}
