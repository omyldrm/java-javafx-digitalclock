package be.kdg.acs2526.digitalclock;

import be.kdg.acs2526.digitalclock.model.DigitalClockModel;
import be.kdg.acs2526.digitalclock.model.DigitalClockModel;
import be.kdg.acs2526.digitalclock.view.DigitalClockPresenter;
import be.kdg.acs2526.digitalclock.view.DigitalClockView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){launch(args);}

    @Override
    public void start(Stage primaryStage) {
        DigitalClockModel model = new DigitalClockModel();
        DigitalClockView view = new DigitalClockView();
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Digital Clock");
        primaryStage.setWidth(500);
        primaryStage.setHeight(300);
        new DigitalClockPresenter(model, view);
        primaryStage.show();
    }
}

