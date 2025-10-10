package dev.richardschmidt.chess.game.pieces.ext;

import dev.richardschmidt.chess.game.Board;
import dev.richardschmidt.chess.game.pieces.Piece;
import dev.richardschmidt.chess.game.pieces.PieceColor;
import dev.richardschmidt.chess.utils.Utils;
import dev.richardschmidt.chess.utils.vector.Vec2;
import dev.richardschmidt.chess.utils.vector.Vec2Helper;

public class RookPiece extends Piece {

    protected final Vec2[] directions = new Vec2[]{
            new Vec2(0, 1),
            new Vec2(0, -1),
            new Vec2(1, 0),
            new Vec2(-1, 0)
    };

    public RookPiece(Board board, Vec2 position, PieceColor color) {
        super(board, position, color, true, false);
    }

    @Override
    public void calculateMoves() {
        this.clearMoves();

        for (Vec2 direction : this.directions) {

            for (int i = 1; i <= Utils.BOARD_SIZE; i++) {

                Vec2 newPosition = Vec2Helper.sumVectors(position, Vec2Helper.incrementVector(direction, i));

                if (!this.board.isValidPosition(newPosition))
                    break;

                if (this.board.isOcupiedByOpponent(this, newPosition)) {
                    this.takableMoves.add(newPosition);
                    break;
                }

                if (this.board.isOcupied(newPosition))
                    break;

                this.movableMoves.add(newPosition);

            }

        }

    }
}
