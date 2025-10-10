package dev.richardschmidt.chess.game.pieces.ext;

import dev.richardschmidt.chess.game.Board;
import dev.richardschmidt.chess.game.pieces.PieceColor;
import dev.richardschmidt.chess.utils.vector.Vec2;

public class QueenPiece extends RookPiece{

    protected final Vec2[] directions = new Vec2[]{
            new Vec2(0, 1),
            new Vec2(0, -1),
            new Vec2(1, 0),
            new Vec2(-1, 0),
            new Vec2(1, 1),
            new Vec2(1, -1),
            new Vec2(1, -1),
            new Vec2(-1, -1)
    };

    public QueenPiece(Board board, Vec2 position, PieceColor color) {
        super(board, position, color);
    }
}
