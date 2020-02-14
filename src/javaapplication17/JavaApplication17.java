package javaapplication17;

import java.util.Scanner;

public class JavaApplication17 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;

        double dolarsDouble;
        char letter;
        float eur, dolars;
        int euro, dolar, lettInt, num, dolar1;
        String euros, yenes, lett, letter2, number, euros1, boxeuro, slett, e;
        double libra;
        

        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Exit");
                    break;

                case 1:
                     System.out.print("Quantity of euros: ");
                    euro = keyboard.nextInt();
                    dolars = functionIntFloat(euro);
                    System.out.println("Dolars: " + dolars + "$");
                    break;

                case 2:
                    System.out.println("Euros: ");
                    euro = keyboard.nextInt();
                    dolarsDouble = FunctionIntToDouble(euro);
                    System.out.println(dolarsDouble);
                    break;

                case 3:
                    System.out.print("Quantity of euros: ");
                    euro = keyboard.nextInt();
                    e = functionIntString(euro);
                    System.out.println("String: " + e);

                case 4:
                    System.out.print("Quantity of euros: ");
                    euros1 = keyboard.next();
                    dolar1 = functionStringInt(euros1);
                    System.out.println("Dolars: " + dolar1 + "$");
                    break;

                case 5:
                    System.out.print("Quantity of euros:");
                    float Sergio = keyboard.nextFloat();
                    int Carla = functionFloatInt(Sergio);
                    System.out.println("Dolars: " + Carla + "$");
                    break;

                case 6:
                    System.out.print("Euros?: ");
                    eur = keyboard.nextFloat();
                    euros = functionFloatToString(eur);
                    System.out.println(euros);
                    break;

                case 7:
                    System.out.print("Char?: ");
                    letter = keyboard.next().charAt(0);
                    lettInt = (int) (letter);
                    letter2 = functionChar(lettInt);
                    System.out.println("The char in binary is " + lettInt);
                    System.out.println("The char in int is " + letter2);
                    break;

                case 8:
                    System.out.print("Write a name: ");
                    slett = keyboard.next();
                    letter2 = functionCharToBinary(slett);
                    System.out.println("The name in binary is " + letter2);
                    break;

                case 9:
                    System.out.print("Write a number between 0 and 255: ");
                    num = keyboard.nextInt();
                    number = functionIntToChar(num);
                    System.out.println("The number in int is " + number);
                    break;

                case 10:
                    System.out.println("ASCII");
                    for (int I = 32; I < 64; I++) {
                        number = functionCharToInt(I);
                        System.out.print(I + "-" + (char) (I) + "-" + number + "\t");
                        number = functionCharToInt(I + 32);
                        System.out.print((I + 32) + "-" + (char) (I + 32) + "-" + number + "\t");
                        number = functionCharToInt(I + 64);
                        System.out.print((I + 64) + "-" + (char) (I + 64) + "-" + number + "\t");
                        System.out.println("");
                    }
                    break;
            }
        }
    }

    private static void userMenu() {
        System.out.println("");
        System.out.println("Option 1- Int - Float");
        System.out.println("Option 2- Int - Double");
        System.out.println("Option 3- Int - String");
        System.out.println("Option 4- String - Int");
        System.out.println("Option 5- Float - Int");
        System.out.println("Option 6- Float - String");
        System.out.println("Option 7- Char");
        System.out.println("Option 8- Char - Binary");
        System.out.println("Option 9- Int - Char");
        System.out.println("Option 10- Cgar - INt");
        System.out.println("Opción 0- Exit");
        System.out.print("n/Opcion ?: ");
    }

    private static int functionStringInt(String boxeuro) {
        int result = 0;
        result = Integer.valueOf(boxeuro);
        result = (int) (result * 1.1);
        return result;
    }
    private static float functionIntFloat(int boxEuro) {
        float result = 0;
        result = (float) (boxEuro * 1.1f);
        return result;
    }

    private static int functionFloatInt(float boxxie) {
        int result = (int) (boxxie);
        return result;
    }

    private static float FunctionIglesias(int boxEuro) {
        float result = 0;
        result = (float) (boxEuro * 1.1f);
        return result;
    }

    private static double FunctionIntToDouble(int euro) {
        double result = 0;
        result = Double.valueOf(euro * 1.1);
        return result;
    }

    private static String functionIntString(int string) {
        String result;
        result = String.valueOf(string * 1.1f);
        return result;
    }

    private static String functionFloatToString(float eur) {
        String result = "0";
        result = String.valueOf(eur * 1.1);
        return result;
    }

    private static String functionChar(int lettInt) {
        String result = Integer.toBinaryString(lettInt);
        return result;
    }

    private static String functionCharToBinary(String clett) {
        String result = "";
        char letter;
        for (int i = 0; i < clett.length(); i++) {
            letter = clett.charAt(i);
            result += Integer.toBinaryString(letter) + " ";
        }
        return result;
    }

    private static String functionIntToChar(int num) {
        String result = new Character((char) num).toString();
        return result;
    }

    private static String functionCharToInt(int num) {
        String result = Integer.toHexString(num);
        return result;
    }
}
