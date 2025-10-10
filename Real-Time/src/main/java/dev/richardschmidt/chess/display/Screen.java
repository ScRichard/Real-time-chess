package dev.richardschmidt.chess.display;

import dev.richardschmidt.chess.display.button.Button;
import dev.richardschmidt.chess.utils.RenderingObject;
import javafx.scene.canvas.GraphicsContext;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
@Setter
@AllArgsConstructor
public abstract class Screen implements RenderingObject {

    protected Screen lastScreen;

    protected boolean pauseable;

    protected final GraphicsContext graphicsContext;

    protected final ArrayList<Button> buttons = new ArrayList<>();

    public void onRender(double mouseX, double mouseY) {
        buttons.forEach(button -> button.onRender(mouseX, mouseY));
    }

    public void addButtons(Button... buttons) {
        this.buttons.addAll(Arrays.asList(buttons));
    }
}
