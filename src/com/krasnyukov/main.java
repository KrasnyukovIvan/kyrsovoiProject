package com.krasnyukov;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        List<ZNAK> list = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        list.add(new ZNAK("Краснюков", "Иван", ZnakZodiaka.Scales, simpleDateFormat.parse("21.10.2000")));
        list.add(new ZNAK("Гладков", "Кирилл", ZnakZodiaka.Virgo, simpleDateFormat.parse("27.08.2000")));
        list.add(new ZNAK("Мухонько", "Илья", ZnakZodiaka.Fish, simpleDateFormat.parse("25.03.2000")));


        System.out.println("Для выхода из программы нажмите z");
        Scanner scanner = new Scanner(System.in);
        String inputString = "";

        while (!inputString.equals("z")) {
            System.out.println("Введите месяц: ");
            inputString = scanner.next();

            //добавить проверку ввода

            SimpleDateFormat format = new SimpleDateFormat("MM");
            Boolean notFound = true;
            for (ZNAK element: list) {
                if (format.format(element.getBirthday()).equals(inputString)) {
                    System.out.println(element.getfName());
                    notFound = false;
                }
            }

            if (notFound) {
                System.out.println("Таких сотрудников нет");
            }
        }
    }
}
