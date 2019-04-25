package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String input, okonch;

        System.out.print("Введите предложение: ");
        input = str.nextLine();

        int count = 0;

        if (input.length() != 0){
            count++;

            for (int i=0; i<input.length(); i++){
                if(input.charAt(i) == ' '){
                    count++;
                }
            }
        }

        if (count == 1) {
            okonch = " слово";
        }
        else if (count ==2 |count == 3|count == 4) {
            okonch = " слова"; }
        else {
            okonch = " слов";
        }

        System.out.print("Вы ввели " + count + okonch);

    }


}
