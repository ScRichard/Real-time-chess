package dev.richardschmidt.chess.game.pieces.ext;

import dev.richardschmidt.chess.game.Board;
import dev.richardschmidt.chess.game.pieces.Piece;
import dev.richardschmidt.chess.game.pieces.PieceColor;
import dev.richardschmidt.chess.utils.vector.Vec2;
import dev.richardschmidt.chess.utils.vector.Vec2Helper;


public class PawnPiece extends Piece {

    public PawnPiece(Board board, Vec2 position, PieceColor color) {
        super(board, position, color, true, false);
    }

    @Override
    public void calculateMoves() {
        this.clearMoves();

        Vec2 movePosition = Vec2Helper.sumVectors(this.position, new Vec2(0, this.getIncrementation()));
        Vec2 firstMovePosition = Vec2Helper.sumVectors(this.position, new Vec2(0, 2 * this.getIncrementation()));

        Vec2[] takable = new Vec2[] {
                new Vec2(1, this.getIncrementation()),
                new Vec2(-1, this.getIncrementation())
        };

        for (Vec2 direction : takable) {

            Vec2 newPosition = Vec2Helper.sumVectors(this.position, direction);

            if (!this.board.isValidPosition(newPosition) || !this.board.isOcupiedByOpponent(this, newPosition))
                continue;

            this.takableMoves.add(newPosition);

        }

        if (this.board.isOcupied(movePosition))
            return;

        this.movableMoves.add(movePosition);

        if(!this.firstMove || this.board.isOcupied(firstMovePosition))
            return;

        this.movableMoves.add(firstMovePosition);

    }
}
