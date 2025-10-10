package dev.richardschmidt.chess;

import dev.richardschmidt.chess.display.Screen;
import dev.richardschmidt.chess.display.screens.MainMenuScreen;
import dev.richardschmidt.chess.utils.Utils;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicReference;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(Utils.WINDOW_WIDTH, Utils.WINDOW_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Screen screen = new MainMenuScreen(null, gc);

        AtomicReference<Double> mouseX = new AtomicReference<>((double) 0);
        AtomicReference<Double> mouseY = new AtomicReference<>((double) 0);
        canvas.setOnMouseMoved(e -> {
            mouseX.set(e.getX());
            mouseY.set(e.getY());
        });

        AnimationTimer timer = new AnimationTimer() {

            @Override
            public void handle(long now) {

                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

                screen.onRender(mouseX.get(), mouseY.get());
            }
        };

        timer.start();

        Pane root = new Pane();
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, Utils.WINDOW_WIDTH, Utils.WINDOW_HEIGHT);

        stage.setTitle(Utils.TITLE);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
