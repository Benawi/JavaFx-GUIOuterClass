package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    public TextField txt;
    CheckBox cb1, cb2;
    Button btn;
    String str, str2 = ", you did not select any course";

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        BorderPane pane = new BorderPane();
        Label lbl = new Label("fxLabel");
        txt = new TextField();
        btn = new Button("Submit");
        HBox hb = new HBox(20);
        hb.getChildren().addAll(lbl, txt, btn);
        pane.setTop(hb);
        txt.setOnMouseClicked(event -> {
            txt.setText("why you click me");
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Again why you click me");
            a.show();

        });
        VBox vbox = new VBox(20);
        Label lbl3 = new Label("Please choose one or more ");
        cb1 = new CheckBox("Java");
        cb2 = new CheckBox("python");
        vbox.getChildren().addAll(lbl3, cb1, cb2);
        pane.setRight(vbox);
        btn.setOnAction(new Controller(txt,cb1,cb2));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(pane, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
