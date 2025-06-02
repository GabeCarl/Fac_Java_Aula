class Pessoa {
   String nome;
   int idade;
   String cidade;

}

public class aula01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Gabriel";
        p1.idade = 24;
        p1.cidade = "Minas Gerais";

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("Cidade: " + p1.cidade);
    }
}

