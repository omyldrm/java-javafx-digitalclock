package be.kdg.acs2526.digitalclock.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class DigitalClockView extends BorderPane {
    // private Node attributes (controls)
    private Label timeLabel;
    private ComboBox<String> comboBox;
    private Label date;

    public DigitalClockView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        // create and configure controls
        timeLabel = new Label();
        comboBox = new ComboBox<String>();
        date = new Label();
    }

    private void layoutNodes() {
        VBox vBox = new VBox(date, timeLabel, comboBox);
        vBox.setSpacing(15);
        BorderPane.setMargin(vBox, new Insets(15));
        vBox.setAlignment(Pos.CENTER);
        setCenter(vBox);
        timeLabel.setFont(Font.font(30));
        date.setFont(Font.font(30));

        comboBox.getItems().addAll("Etc/UTC", "Etc/GMT", "America/New_York",
                "America/Chicago", "America/Denver", "America/Los_Angeles",
                "America/Halifax", "Pacific/Honolulu", "Europe/Paris",
                "Europe/Helsinki", "Europe/Moscow", "Asia/Kolkata",
                "Asia/Tokyo", "Australia/Sydney", "Pacific/Auckland",
                "America/Sao_Paulo", "Africa/Harare", "Africa/Nairobi", "Asia/Singapore");
    }


    public void receiveString(String string){
        timeLabel.setText(string);
    };


    public ComboBox<String> getComboBox() {
        return comboBox;
    }

    public void receiveDate(String string){
        date.setText(string);
    }

    // package-private Getters
    // for controls used by Presenter
}

