package dev.richardschmidt.chess.pieces.ext;

import dev.richardschmidt.chess.pieces.Piece;
import dev.richardschmidt.chess.pieces.PieceColor;
import dev.richardschmidt.chess.utils.Vec2;

public class PawnPiece extends Piece {

    private boolean firstMove = false;

    public PawnPiece(PieceColor color, Vec2 position) {
        super(new Vec2[] {
                new Vec2(0, 1),
        }, new Vec2[] {
                new Vec2(-1, 1),
                new Vec2(1, 1),
        }, color, position, 0);
    }


}
