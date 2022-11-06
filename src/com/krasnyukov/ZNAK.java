package com.krasnyukov;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ZNAK {
    public String getfName() {
        return fName;
    }

    private String fName;
    private String lName;
    private ZnakZodiaka znakZodika;

    public Date getBirthday() {
        return birthday;
    }

    private Date birthday;

    public ZNAK() {};
    public ZNAK(String fName, String lName, ZnakZodiaka znakZodika, Date birthday) {
        this.fName = fName;
        this.lName = lName;
        this.znakZodika = znakZodika;
        this.birthday = birthday;
    }

    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    @Override
    public String toString() {
        return  fName + " " + lName + " - " + znakZodika + " (" + format.format(birthday) + ")";
    }
}
