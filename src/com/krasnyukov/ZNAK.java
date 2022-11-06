package com.krasnyukov;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ZNAK {
    private String fName;
    private String lName;
    private ZnakZodiaka znakZodika;

    private Date birthday;

    public ZNAK() {};

    public ZNAK(String[] arr){
        try{
            this.lName = arr[0];
            this.fName = arr[1];
            this.znakZodika = ZnakZodiaka.fromString(arr[2]);
            this.birthday = format.parse(arr[3]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException("Файл заполнен не корректно.");
        }
    }
    public ZNAK(String lName, String fName, ZnakZodiaka znakZodika, Date birthday) {
        this.fName = fName;
        this.lName = lName;
        this.znakZodika = znakZodika;
        this.birthday = birthday;
    }

    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public String getfName() {
        return fName;
    }
    public String getlName() {
        return lName;
    }
    public String getznakZodika() {
        return znakZodika.toString();
    }

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return  fName + " " + lName + " - " + znakZodika + " (" + format.format(birthday) + ")";
    }
}