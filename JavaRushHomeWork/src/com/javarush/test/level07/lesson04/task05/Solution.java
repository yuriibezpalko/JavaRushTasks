package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayBig = new int[20];
        int[] arrayFirst = new int[10];
        int[] arraySecond = new int[10];

        try
        {
            for (int i = 0; i < arrayBig.length; i++)
            {
                arrayBig[i] = Integer.parseInt(reader.readLine());
            }

        } catch (IOException e) { e.getStackTrace(); }

        for (int i = 0, mid=arrayBig.length>>1, j = mid; i < mid; i++, j++)

            {
                arrayFirst[i] = arrayBig[i];
                arraySecond[i] = arrayBig[j];
            }

        for (Integer i : arraySecond) { System.out.println(i); }

    }
}
