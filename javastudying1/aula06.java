class Veiculo {

    public String mover() {
        return "O veículo está se movendo.";
    }
}

class Carro extends Veiculo {

    @Override
    public String mover() {
        return "O carro esta se movendo rapidamente.";
    }
}

class Bicicleta extends Veiculo {

    @Override
    public String mover() {
        return "A bicicleta esta se movendo lentamente.";
    }
}

public class aula06 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();

        System.out.println(carro.mover());
        System.out.println(bicicleta.mover());
    }
}