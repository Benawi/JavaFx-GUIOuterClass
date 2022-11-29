package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller implements EventHandler<ActionEvent> {
    String str, str2;
    TextField txt;
    CheckBox cb1, cb2;

    Controller(TextField txt, CheckBox cb1, CheckBox cb2) {
        this.txt = txt;
        this.cb1 = cb1;
        this.cb2 = cb2;
    }

    @Override
    public void handle(ActionEvent event) {
        Main m = new Main();
        //if (event.getSource()==m.btn)
        str = txt.getText();
        str = txt.getText();
        if (cb1.isSelected() && cb2.isSelected())
            str2 = cb1.getText() + " and " + cb2.getText();
        else if (cb1.isSelected())
            str2 = cb1.getText();
        else if (cb2.isSelected())
            str2 = cb2.getText();
        Alert a = new Alert(Alert.AlertType.WARNING, str + str2);
        a.show();
    }
}
