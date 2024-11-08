package com.iterasys;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ola mundo ");

        float resultado = somar(5, 2);
        System.out.println("A soma de 5 + 7 = " + resultado);
    }

    public static float somar(float num1, float num2) {

        float resultado = num1 + num2;
        System.out.println("soma de " + num1 + " + " + num2 + " = " + resultado);

        return resultado;
    }

    public static float subtrair(float num1, float num2) {

        float resultado = num1 - num2;
        System.out.println("subtrair de " + num1 + " - " + num2 + " = " + resultado);

        return resultado;
    }

    public static float multiplicar(float num1, float num2) {
        return num1 * num2;
    }

    public static float dividir(float num1, float num2) {
        if (num2 != 0) {
            return num1 / num2; // Retorna 0 ou algum valor específico para indicar erro
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0;
        }
    }

    public static String dividirTry(int num1, int num2) {
        try {
            return String.valueOf(num1 / num2);
        } catch (Exception e) {
            return "Divisão por zero não é permitida.";
        }
    }
}
