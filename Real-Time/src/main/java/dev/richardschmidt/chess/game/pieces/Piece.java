package dev.richardschmidt.chess.game.pieces;

import dev.richardschmidt.chess.game.Board;
import dev.richardschmidt.chess.utils.vector.Vec2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public abstract class Piece {

    protected Board board;

    protected Vec2 position;

    protected PieceColor color;

    protected final ArrayList<Vec2> movableMoves = new ArrayList<>();
    protected final ArrayList<Vec2> takableMoves = new ArrayList<>();

    protected boolean firstMove = true;
    protected final boolean isKing;

    public abstract void calculateMoves();

    public void moveTo(Vec2 position) {
        this.position = position;
    }

    public void clearMoves() {
        this.movableMoves.clear();
        this.takableMoves.clear();
    }

    public int getIncrementation() {
        return this.color == PieceColor.WHITE ? 1 : -1;
    }

}
