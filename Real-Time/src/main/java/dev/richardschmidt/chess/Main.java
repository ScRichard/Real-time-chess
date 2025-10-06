package dev.richardschmidt.chess;

import dev.richardschmidt.chess.pieces.PieceColor;
import dev.richardschmidt.chess.pieces.ext.PawnPiece;
import dev.richardschmidt.chess.utils.Vec2;

public class Main {
    public static void main(String[] args) {
        PawnPiece pawn = new PawnPiece(PieceColor.WHITE, new Vec2(0, 1));
        System.out.println(pawn.getPosition().toString());

        pawn.makeMove(new Vec2(0, 1));

        System.out.println(pawn.getPosition().toString());
    }
}