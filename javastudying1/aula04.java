class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return this.nome;
    }
    

    public Double setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
            return preco;
        } else {
            return null;
        }
    }
}

public class aula04 {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.00);
        
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preco do produto: " + produto.getPreco());
        
        produto.setNome("Smartphone");
        Double novoPreco = produto.setPreco(1500.00);
        
        if (novoPreco >= 0) {
            System.out.println("Novo nome do produto: " + produto.getNome());
            System.out.println("Novo preco do produto: " + novoPreco);
        } else {
            System.out.println("Preco invalido.");
        }
    }
}