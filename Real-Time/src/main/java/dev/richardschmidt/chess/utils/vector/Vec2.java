package dev.richardschmidt.chess.utils.vector;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vec2 {

    private int x;
    private int y;

    public void addVector(Vec2 vec) {
        this.x += vec.x;
        this.y += vec.y;
    }

    public void subtractVector(Vec2 vec) {
        this.x -= vec.x;
        this.y -= vec.y;
    }

    public boolean equals(Vec2 vec) {
        return this.x == vec.x && this.y == vec.y;
    }

}
