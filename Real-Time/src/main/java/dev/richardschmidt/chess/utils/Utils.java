package dev.richardschmidt.chess.utils;

public class Utils {

    public static final int boardSize = 7; // 7 is because 0 counts as first

    public static Vec2 sumPositions(Vec2 position1, Vec2 position2, int scale) {
        position1.setX(position1.getX() + position2.getX() * scale);
        position1.setY(position1.getY() + position2.getY() * scale);
        return position1;
    }
}
