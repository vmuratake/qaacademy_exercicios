package easy;


import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        //String  primeiroNumero;
        int numero1;
        //String segundoNumero;
        int numero2;

        //primeiroNumero = JOptionPane.showInputDialog("Digite um número: ");
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        //segundoNumero = JOptionPane.showInputDialog("Digite outro número: ");
        //numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        //System.out.println("O valor do primeiro número é: " +segundoNumero);
        //System.out.println("O valor do segundo número é: " +primeiroNumero);

        System.out.println("O valor do segundo número é: " +numero2);
        System.out.println("O valor do segundo número é: " +numero1);
    }
    
}
