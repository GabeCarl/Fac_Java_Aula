class Funcionario {

    String nome;
    double salario;

    public double calcularBonus() {
        return salario * 0.1; // Retorna 10% do salário como bônus
    }
}

class Gerente extends Funcionario {
    @Override
    public double calcularBonus() {
        return salario * 0.2; // Retorna 20% do salário como bônus
    }
}

public class aula05 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); {
        funcionario.nome = "Gabriel";
        funcionario.salario = 2199.00;
        }

        Gerente gerente = new Gerente(); {
            gerente.nome = "Adriana";
            gerente.salario = 4680.90;
        }

        System.out.println("Bonus do Funcionario: " + funcionario.calcularBonus());
        System.out.println("Bonus do Gerente: " + gerente.calcularBonus());
    }
}