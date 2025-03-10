package c9;

import java.util.HashMap;

public class PieceFactory {
    private HashMap PiecePool = new HashMap();

    public APiece getAPiece(String key) {
        if (!PiecePool.containsKey(key)) {
            APiece p = new OnePiece(key);
            PiecePool.put(key, p); // 将实例对象放入池中

            return p;
        }
        return (APiece) PiecePool.get(key);
    }

    public int getNumPieces() {
        return PiecePool.size();
    }
}
