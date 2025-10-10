package dev.richardschmidt.chess.utils;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class FontUtils {

    private FontUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static void drawCenteredText(GraphicsContext gc, String text, double x, double y, Font font, Color color) {
        if (text == null || text.isEmpty()) return;

        gc.setFont(font);
        gc.setFill(color);

        double textWidth = getTextWidth(text, font);
        double textHeight = getTextHeight(text, font);

        gc.fillText(text, x - textWidth / 2.0, y + textHeight / 4.0); // adjust baseline
    }

    public static double getTextWidth(String text, Font font) {
        Text helper = new Text(text);
        helper.setFont(font);
        return helper.getLayoutBounds().getWidth();
    }

    public static double getTextHeight(String text, Font font) {
        Text helper = new Text(text);
        helper.setFont(font);
        return helper.getLayoutBounds().getHeight();
    }

    public static void drawText(GraphicsContext gc, String text, double x, double y, Font font, Color color) {
        gc.setFont(font);
        gc.setFill(color);
        gc.fillText(text, x, y);
    }

}
