package com.example.ticketservice.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class TimeConverter {

    public static long localDateTimeToLong(LocalDateTime time) {
        return time.atZone(ZoneId.systemDefault()).toEpochSecond();
    }

    public static LocalDateTime longToLocalDateTime(long time) {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(time), TimeZone.getDefault().toZoneId());
    }
}
