package dev.richardschmidt.chess.game.pieces.ext;

import dev.richardschmidt.chess.game.Board;
import dev.richardschmidt.chess.game.pieces.Piece;
import dev.richardschmidt.chess.game.pieces.PieceColor;
import dev.richardschmidt.chess.utils.vector.Vec2;
import dev.richardschmidt.chess.utils.vector.Vec2Helper;

public class KingPiece extends Piece {

    private final Vec2[] directions = new Vec2[]{
            new Vec2(0, 1),
            new Vec2(0, -1),
            new Vec2(1, 0),
            new Vec2(-1, 0),
            new Vec2(1, 1),
            new Vec2(1, -1),
            new Vec2(1, -1),
            new Vec2(-1, -1)
    };

    public KingPiece(Board board, Vec2 position, PieceColor color) {
        super(board, position, color, true, true);
    }

    @Override
    public void calculateMoves() {

        this.clearMoves();

        for (Vec2 direction : this.directions) {

            Vec2 newPosition = Vec2Helper.sumVectors(this.position, direction);

            if (!this.board.isValidPosition(newPosition) || this.board.isOcupiedByFriend(this, newPosition))
                continue;

            if (this.board.isOcupiedByOpponent(this, newPosition)) {
                this.takableMoves.add(newPosition);
                continue;
            }

            this.movableMoves.add(newPosition);

        }

    }
}
