package be.kdg.acs2526.digitalclock.model;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DigitalClockModel {
    private ZonedDateTime time;
    private ZonedDateTime date;
    // private attributes

    public DigitalClockModel() {
        // Constructor
    }

    // methods with business logic

    public String getLocalTime(ZoneId zoneId) {
        time = ZonedDateTime.now(zoneId);
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public String getLocalDate(ZoneId zoneId) {
        date = ZonedDateTime.now(zoneId);
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // necessary getters and setters

}

