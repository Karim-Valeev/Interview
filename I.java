package ru.kpfu.itis.valeev;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class I {

    private final String NAME = "Karim";

    private final String SERNAME = "Valeev";

    private final String EMAIL = "karim.valeev.i@gmail.com";

    private final String GIT = "https://github.com/Karim-Valeev";

    private final LocalDate BIRTHDAY = LocalDate.parse("01.01.2001", DateTimeFormatter.ofPattern("dd.MM.yyyy"));

    public String getNAME() {
        return NAME;
    }

    public String getSERNAME() {
        return SERNAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public String getGIT() {
        return GIT;
    }

    public LocalDate getBIRTHDAY() {
        return BIRTHDAY;
    }
}
