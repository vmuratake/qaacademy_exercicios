package parteII;

public class ExMetodoComRetorno {
    
    public static void main(String[] args) {
        String idade = calculo1();
        System.out.println(idade);
        String ferias = calculo2();
        System.out.println(ferias);
        String temperatura = calculo3();
        System.out.println(temperatura);
        String velocidade = calculo4();
        System.out.println(velocidade);
        String lotacao = calculo5();
        System.out.println(lotacao);
        int soma = calculo6();
        System.out.println(soma);
    }

    public static String calculo1(){
        int idade = 18;    
        if (idade >= 18) {
            return "Você alcançou a maioridade";
        }else{
            return "Você ainda é menor de idade";
        }
    }
    
    public static String calculo2(){
        int ferias = 3000;
        if (ferias >= 5000){
            return "Você guardou " +(ferias) + " E conseguirá viajar!";
        }else{
            return "Você guardou " +(ferias) + " E não conseguirá viajar!";
        }  
    }
    
    public static String calculo3(){
        int temperatura = 20;
        if(temperatura >= 22){
            return "A temperatura está quente";
        }else{
            return "A temperatura está normal ou fria";
        }   
    }

    public static String calculo4(){
        int velocidade = 110;
        if (velocidade > 80){
            return "Você ultrapassou o limite de velocidade";
    }else{
        return "Você está dentro do limite de velocidade permitida";
         }
    }


    public static String calculo5(){
        int lotacao = 42;
        if (lotacao > 32){
            return "Ônibus superlotado";
    }else{
        return "Ônibus dentro da capacidade de lotação";
         }
    }

    public static int calculo6(){
        int soma, num1=5, num2=9;
        soma=num1+num2;
        return soma;
    }
}



