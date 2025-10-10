package dev.richardschmidt.chess.utils;

import javafx.scene.input.KeyEvent;

import java.awt.event.MouseEvent;

public interface RenderingObject {

    void onRender(double mouseX, double mouseY);

    void onMouseEvent(MouseEvent event);

    void onKeyEvent(KeyEvent event);

}
