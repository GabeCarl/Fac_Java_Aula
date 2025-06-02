class Retangulo {
    int largura;
    int altura;

    int calcularArea() {
        return largura * altura;
    }
}

public class aula02 {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.largura = 5;
        retangulo1.altura = 10;
        int area = retangulo1.calcularArea();
        System.out.println("A area do retangulo: " + area);
    }
}