package easy;

import javax.swing.JOptionPane;

public class Exercicio08 {
    public static void main(String[] args) {

        double ir = 0.0;
        
        String salarioString = JOptionPane.showInputDialog("Qual o valor do salário: R$ ");
        double salario = Double.parseDouble(salarioString);


        if (salario > 0 && salario <= 1903.98) {
            System.out.println("Isento do imposto de Renda");
        }

        if (salario > 1903.99 && salario <= 2826.65) {
            ir = (salario*0.075) - 142.80;
            //System.out.println("O valor do INSS será R$  " +inss);
        }

        if  (salario >= 2826.66 && salario <= 3751.05) {
            ir = (salario*0.15) - 354.80;
            //System.out.println("O valor do INSS será R$  " +inss);
        }

        if  (salario >= 3751.06 && salario <= 4664.68) {
            ir = (salario*0.225) - 636.13;
            //System.out.println("O valor do INSS será R$  " +inss);
        }

        if  (salario >= 4664.68) {
            ir = (salario*0.275) - 869.36;
            //System.out.println("O valor do INSS será R$  " +inss);
        }

        System.out.println("Salário Bruto R$ " +salario);
        System.out.println("Salário Liquido R$ " +(salario - ir));   
        System.out.println("Imposto a pagar R$ " +ir);
    }
    
}
