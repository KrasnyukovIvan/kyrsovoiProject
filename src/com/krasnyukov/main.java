package com.krasnyukov;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<ZNAK> staffList = new ArrayList<>();
        try(FileInputStream fileReader = new FileInputStream("Staff.txt")) {
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(fileReader, "utf8"));
            String line = bufferedReader.readLine();
            while (line != null) {
                staffList.add(new ZNAK(line.split(" ")));
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Для выхода из программы нажмите z");
        Scanner scanner = new Scanner(System.in);
        String inputString = "";
        int numMonth;

        while (!inputString.equals("z")) {
            System.out.println("Введите месяц: ");
            inputString = scanner.next();

            if (!inputString.matches("[-+]?\\d+")) {
                System.out.println("Введите число");
                continue;
            } else {
                numMonth = Integer.parseInt(inputString);
                if (numMonth > 12 || numMonth < 1) {
                    System.out.println("Введите корректный месяц");
                    continue;
                }
                if (inputString.length() == 1) {
                    inputString = "0" + inputString;
                }
            }


            SimpleDateFormat format = new SimpleDateFormat("MM");
            Boolean notFound = true;
            for (ZNAK elem: staffList) {
                if (format.format(elem.getBirthday()).equals(inputString)) {
                    System.out.println("У сотрудника " + elem.getlName()
                                        + " знак зодиака - " + elem.getznakZodika()
                                        + ", так как он родился " + format.format(elem.getBirthday()));
                    notFound = false;
                }
            }

            if (notFound) {
                System.out.println("Нет сотрудников родившихся в данный месяц");
            }
        }


    }
}
