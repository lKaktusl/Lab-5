package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String testString="";
        // testString ="lhla578nn5.n lak mac argfa 74  ghjkl";
        System.out.println("23. Из строки удалить все цифры.");
        System.out.println("Введите строку:");
        Scanner scanner= new Scanner(System.in);
        testString=scanner.nextLine();
        System.out.println("Введённая строка:"+testString);
        string(testString);
        stringBuffer(testString);

        }
        public static void string(String string){
            //в этом методе работает обычная строка, которую нельзя изменять
            System.out.println("Вариант решения, используя String:");
            char charArray[]=new char[string.length()];
            int code;
            for (int i = 0; i <string.length() ; i++) {
                code=(int)string.charAt(i);
                if(code<48||code>57)
                charArray[i]=string.charAt(i);
            }
            String res=new String(charArray);
            System.out.println(res);

        }
        public static void stringBuffer(String string){
        //в этом методе работает динамическая строка, которую можно изменять
            System.out.println("Вариант решения, используя StringBuffer:");

            string=string.replaceAll("\\d","");

            System.out.println(string);
        }
}
