package dev.richardschmidt.chess.game;

import dev.richardschmidt.chess.game.pieces.Piece;
import dev.richardschmidt.chess.utils.vector.Vec2;

import java.util.HashMap;
import java.util.TreeMap;

public class Board {

    private final HashMap<Vec2, Piece> pieces = new HashMap<>();

    private GamePhase gamePhase = GamePhase.STARTING;

    public boolean isOcupied(Vec2 pos) {
        return pieces.containsKey(pos);
    }

    public boolean isOcupiedByOpponent(Piece piece, Vec2 pos) {
        return pieces.get(pos).getColor() != piece.getColor();
    }
    public boolean isOcupiedByFriend(Piece piece, Vec2 pos) {
        return pieces.get(pos).getColor() == piece.getColor();
    }

    public void addPiece(Piece piece) {
        this.pieces.put(piece.getPosition(), piece);
    }

    public void movePiece(Piece piece, Vec2 position) {
        pieces.remove(piece.getPosition());
        pieces.put(position, piece);
        piece.setPosition(position);
    }

    public boolean isValidPosition(Vec2 position) {
        return position.getX() >= 0 && position.getY() >= 0 && position.getX() < 8 && position.getY() < 8;
    }

}
