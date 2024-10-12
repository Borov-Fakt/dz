package dz;

import java.util.Scanner;

public class robot {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какой сейчас час");
        int Number = scanner.nextInt();
        if (Number >= 4 && Number < 12)
        {
            System.out.println("доброе утро");
        }
        if (Number >= 12 && Number < 18)
        {
            System.out.println("добрый день");
        }
        if (Number >= 18 && Number < 23)
        {
            System.out.println("добрый вечер");
        }
        if (Number >= 23 || Number < 4)
        {
            System.out.println("доброй ночи");
        }
        if (Number > 24)
        {
            System.out.println("неврно ведено время");
        }
    }
}
