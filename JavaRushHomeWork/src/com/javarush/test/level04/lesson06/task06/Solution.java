package com.javarush.test.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        String name;
        int age;

        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            name = reader.readLine();
            age = Integer.parseInt(reader.readLine());

            if (age > 20)
                System.out.println("И 18-ти достаточно");
        }
        catch (Exception e){
            System.err.println(e);
        }

    }
}