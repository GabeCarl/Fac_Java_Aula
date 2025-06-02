class ContaBancaria {

    String titular;
    double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Seu novo saldo e: %.2f%n", saldo);
        } else {
            System.out.println("Valor invalido para depositar.");
        }
    }

    public void sacar (double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Seu saldo atual: %.2f%n", saldo);
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para essa operação.");
        } else {
            System.out.println("Valor invalido para sacar.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Seu saldo atual: %.2f%n", saldo);
    }
}

public class aula03 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Gabriel";
        conta.saldo = 3687.65;
    
        conta.depositar(520);
        conta.sacar(1095);
    }
}