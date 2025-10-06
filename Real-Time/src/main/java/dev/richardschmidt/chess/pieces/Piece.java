package dev.richardschmidt.chess.pieces;

import dev.richardschmidt.chess.utils.Utils;
import dev.richardschmidt.chess.utils.Vec2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.util.Arrays;

@Getter
@Setter
@AllArgsConstructor
public class Piece {

    private final Vec2[] posibleMoves;
    private final Vec2[] takableMoves;

    private final PieceColor pieceColor;

    private Vec2 position;

    private long delay;

    private final int increment = this.pieceColor == PieceColor.BLACK ? -1 : 1;

    public void onUpdate() {

    }

    public void canTake() {

    }

    public void makeMove(Vec2 move) {
        this.position.sumPositions(move, increment);
    }

    public Vec2[] getPossibleMoves() {
        return Arrays.stream(posibleMoves).filter(move -> !move.equals(position)).toArray(Vec2[]::new);
    }

    public boolean isValidMove(Vec2 move) {
        Vec2 newPosition = Utils.sumPositions(this.position, move, increment);

        return (newPosition.getX() >= 0 && newPosition.getY() >= 0 && newPosition.getX() <= Utils.boardSize && newPosition.getY() <= Utils.boardSize);
    }

}
