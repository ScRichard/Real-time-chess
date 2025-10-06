package dev.richardschmidt.chess.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vec2 {
    private int x;
    private int y;

    public void sumPositions(Vec2 position, int scale) {
        this.x += position.x * scale;
        this.y += position.y * scale;
    }
}
