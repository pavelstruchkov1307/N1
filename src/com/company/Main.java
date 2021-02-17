package com.company;

public class Main {

    public static void main(String[] args) {
        String nomer = "+7 (924) 6827 823";
        clear(nomer);
    }

    public static void clear(String nom) {
        String corNom = "";
        boolean mess1 = false;
        boolean mess2 = false;
        for (int i = 0; i < nom.length(); i++) {
            if (nom.charAt(i) == '+') {
                corNom = corNom + "8";
                i++;
                mess1 = true;
            } else if (nom.charAt(i) == ' ' || nom.charAt(i) == ')' || nom.charAt(i) == '(') {
                mess2 = true;
            } else {
                corNom = corNom + nom.charAt(i);
            }

        }
        if (corNom.length() == 11) {
            System.out.println(corNom);
        } else {
            System.out.println("Введен некорректный номер");
        }


        if (mess1) {
            System.out.print("Замена +7 на 8; ");
        }
        if (mess2) {
            System.out.print("В номере есть пробелы и/или скобки; ");
        }
        if (corNom.length() > 11) {
            System.out.print("Сумма символов больше 11;");
        }
        if(!mess1 && !mess2){
            System.out.println("Не было изменений");
        }

    }
}
