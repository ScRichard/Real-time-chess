package dev.richardschmidt.chess.display.button;

import dev.richardschmidt.chess.display.Screen;
import dev.richardschmidt.chess.utils.RenderingObject;
import javafx.scene.input.KeyEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.awt.event.MouseEvent;

@Getter
@Setter
@AllArgsConstructor
public class Button implements RenderingObject {

    private Screen parent;

    private String text;

    private double x;
    private double y;
    private double width;
    private double height;

    private int id;

    @Override
    public void onRender(double mouseX, double mouseY) {

    }

    @Override
    public void onMouseEvent(MouseEvent event) {
        switch (id) {
            case 0:
                break;
        }
    }

    @Override
    public void onKeyEvent(KeyEvent event) {

    }
}
