package dev.richardschmidt.chess.utils.vector;

public class Vec2Helper {

    private Vec2Helper() {
        throw new IllegalStateException("Utility class");
    }

    public static Vec2 sumVectors(Vec2 v1, Vec2 v2) {
        return new Vec2(v1.getX() + v2.getX(), v1.getY() + v2.getY());
    }
    public static Vec2 incrementVector(Vec2 v, int scale) {
        return new Vec2(v.getX() * scale, v.getY() * scale);
    }
}
