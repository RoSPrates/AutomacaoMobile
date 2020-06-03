package br.com.cursoudemy.appium.test;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exerc4 {
    public static void main(String args[]) {
        int reajuste;
        double salarioAtual;
        double novoSalario;
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "br"));
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valo do salario: ");
        salarioAtual = transformaEmNumeroDouble(scan.nextLine());
        System.out.print("digite o valor do reajuste: ");
        reajuste = transformaEmNumeroInteiro(scan.nextLine());
        novoSalario = calculaReajusteDeSalario(salarioAtual, reajuste);
        System.out.println(nf.format(novoSalario));
    }

    public static double transformaEmNumeroDouble(String numero) {
        double novoNumero;
        try {
            novoNumero = Double.parseDouble(numero);
        } catch (NumberFormatException ex) {
            numero = numero.substring(0, numero.length() - 3).replaceAll("\\D", "") + "." + numero.substring(numero.length() - 2);
            novoNumero = Double.parseDouble(numero);
        }
        return novoNumero;
    }

    public static int transformaEmNumeroInteiro(String numero) {
        return Integer.parseInt(numero.replaceAll("\\D", ""));
    }

    public static double calculaReajusteDeSalario(double salario, int reajuste) {
        salario = salario + (salario * ((double) reajuste / 100));
        if ((int) salario % 2 == 0) salario += 1;
        return salario;
    }
}

