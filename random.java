package dz;

import java.util.Scanner;

public class random {
    public static void main(String[] args)
    {
        int random = (int)(Math.random()*100) + 1;
        Scanner scan = new Scanner(System.in);
        int g = 0;
        while (g < 3)
        {
            g++;
            System.out.println("ведите число");
            int Number = scan.nextInt();
            if (Number == random)
            {
                System.out.println("число верно");
                break;
            }
            if (Number > random)
            {
                System.out.println("число болше задоного");
            }
            if (Number < random)
            {
                System.out.println("число меньше задоного");
            }
        }


    }
}
