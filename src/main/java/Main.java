import exercicios.Quadrado;

public class Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        q1.setLado(10.5);
        Quadrado q2 = new Quadrado();
        q2.setLado(27.48);

        System.out.println(q1.calcularArea());
        System.out.println(q2.calcularArea());
        System.out.println(q1.calcularPerimetro());
        System.out.println(q2.calcularPerimetro());

    }
}
