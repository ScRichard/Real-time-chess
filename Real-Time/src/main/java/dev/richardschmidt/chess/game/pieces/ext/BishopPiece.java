package dev.richardschmidt.chess.game.pieces.ext;

import dev.richardschmidt.chess.game.Board;
import dev.richardschmidt.chess.game.pieces.PieceColor;
import dev.richardschmidt.chess.utils.vector.Vec2;

public class BishopPiece extends RookPiece{

    protected final Vec2[] directions = new Vec2[]{
            new Vec2(1, 1),
            new Vec2(1, -1),
            new Vec2(1, -1),
            new Vec2(-1, -1)
    };

    public BishopPiece(Board board, Vec2 position, PieceColor color) {
        super(board, position, color);
    }
}
