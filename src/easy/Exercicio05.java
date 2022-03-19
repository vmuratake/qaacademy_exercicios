package easy;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {

        int soma, subtracao, multiplicacao; 
        double media;

        String num1String = JOptionPane.showInputDialog("Digite o primeiro número: ");
        int num1 = Integer.parseInt(num1String);

        String num2String = JOptionPane.showInputDialog("Digite o segundo número: ");
        int num2 = Integer.parseInt(num2String);

        String num3String = JOptionPane.showInputDialog("Digite o terceiro número: ");
        int num3 = Integer.parseInt(num3String);

        soma = num1+num2+num3;
        subtracao = num1-num2-num3;
        multiplicacao = num1*num2*num3;
        media = (num1+num2+num3)/3;

        System.out.println("Valor da soma de " +num1+ "+" +num2+ "+" +num3+ "= " +soma);
        System.out.println("Valor da subtração de " +num1+ "-" +num2+ "-" +num3+ "=" +subtracao);
        System.out.println("Valor da multiplicação de " +num1+ "*" +num2+ "*" +num3+ "= " +multiplicacao);
        System.out.println("Valor da média será: " +media);

        }
    
}
