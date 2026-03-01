package be.kdg.acs2526.digitalclock.view;

import be.kdg.acs2526.digitalclock.model.DigitalClockModel;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DigitalClockPresenter {
    private final DigitalClockModel model;
    private final DigitalClockView view;
    private Timeline timeline;
    private ZoneId zoneId = ZoneId.systemDefault();

    public DigitalClockPresenter(
            DigitalClockModel model, DigitalClockView view) {
        this.model = model;
        this.view = view;
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            view.receiveString(model.getLocalTime(zoneId));
            view.receiveDate(model.getLocalDate(zoneId));
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        view.getComboBox().setOnAction(e -> {
            if (view.getComboBox().getValue() != null) {
                zoneId = ZoneId.of(view.getComboBox().getValue());
                view.receiveString(model.getLocalTime(zoneId));
                view.receiveDate(model.getLocalDate(zoneId));
            }
        });
    }
    private void updateView() {/* fills view*/
        view.receiveString(model.getLocalTime(zoneId));
        view.receiveDate(model.getLocalDate(zoneId));
    }
}

