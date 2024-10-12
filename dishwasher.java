package dz;

import java.util.Scanner;

public class dishwasher {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество тарелок");
        int Plates = scanner.nextInt();
        System.out.println("Введите количество моющие средства");
        double Domestas = scanner.nextDouble();
        while (Plates > 0)
        {

            Domestas -= 0.5;
            if (Domestas < 0.5)
            {
                break;
            }
            Plates--;
            System.out.println("Осталось тарелок " + Plates);
            System.out.println("Осталось моющие средства " + Domestas);
        }
    }
}
