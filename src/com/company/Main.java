package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String nomer = "+7 (924) 6827 823";
        System.out.println(Arrays.toString(clear(nomer)));
    }

    public static String[] clear(String nom) {
        String[] arrStr = new String[2];
        String mess = "";

        if (nom.startsWith("+7")) {
            nom = nom.replace("+7", "8");
            mess += "Замена +7 на 8;";
        }

        if (nom.contains(" ") || nom.contains(")") || nom.contains("(")) {
            nom = nom.replaceAll("\\s+", "");
            nom = nom.replaceAll("\\p{P}", "");
            mess += " В номере есть пробелы и/или скобки";
        }

        if (nom.length() > 11) {
            mess = "Количество символов больше 11";
        }

        if(mess.equals("")){
            mess= "Не было изменений";
        }

        if (nom.length() == 11) {
            arrStr[0] = nom;
        } else {
            arrStr[0] = "Введен некорректный номер";
        }

        arrStr[1] = mess;

        return arrStr;

    }
}
