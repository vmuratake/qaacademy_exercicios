// Exercicio instância de classe:
// 1- Criar um pacote e uma classe (sem metodo main);
// 2- Criar 3 metodos quaisquer;
// 3- Criar 2 variaveis;
// 4- Criar Classe Execução.Java
// 5- Criar metodo main;
// 6- Instanciar a classe de Modelagem;
//    public modelagem obj_MOdelagem = new MOdelagem();
// 7- Exibir o valor das variaveis;
//    (obj_MOdelagem.nomeDaVariavel);
// 8- Executar todos os metodos da classe criada.
//    obj_MOdelagem.metodo1();
//    obj_MOdelagem.metodo2();
//    obj_MOdelagem.metodo3();      


package instancia;

public class Ex01Clientes {
    //declarando variaveis
    public String nome = "Vanessa";
    public String sobrenome = "Muratake";
    public int idade = 40;

    //declarando metodos
    public String primeiroNome (String nome){
        return nome;
    }
    public String segundoNome (String sobrenome){
        return sobrenome;
    }
    public int nascimento (int idade) {
        return idade;
    }    
}