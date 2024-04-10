import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

public class Practical8_q2 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Box box = new Box(100, 100, 100);

        Group root = new Group();
        root.getChildren().add(box);

        Scene scene = new Scene(root, 600, 400, true);
        scene.setFill(Color.LIGHTBLUE);

        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setTranslateZ(-500);
        scene.setCamera(camera);

        scene.widthProperty().addListener((observable, oldValue, newValue) -> {
            double newWidth = newValue.doubleValue();
            box.setWidth(newWidth / 4); 
        });

        scene.heightProperty().addListener((observable, oldValue, newValue) -> {
            double newHeight = newValue.doubleValue();
            box.setHeight(newHeight / 4); 
        });

        primaryStage.setTitle("Rectanguloid Resize");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}