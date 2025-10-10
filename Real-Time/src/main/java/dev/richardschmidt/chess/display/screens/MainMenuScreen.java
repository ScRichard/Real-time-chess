package dev.richardschmidt.chess.display.screens;

import dev.richardschmidt.chess.display.Screen;
import dev.richardschmidt.chess.display.button.Button;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;

import java.awt.event.MouseEvent;

public class MainMenuScreen extends Screen {

    public MainMenuScreen(Screen lastScreen, GraphicsContext graphicsContext) {
        super(lastScreen, true, graphicsContext);

        this.addButtons(
                new Button(this, "Play Game", 0, 0, 200, 50, 1)
        );
    }

    @Override
    public void onRender(double mouseX, double mouseY) {
        super.onRender(mouseX, mouseY);
    }

    @Override
    public void onMouseEvent(MouseEvent event) {

    }

    @Override
    public void onKeyEvent(KeyEvent keyEvent) {

    }


}
