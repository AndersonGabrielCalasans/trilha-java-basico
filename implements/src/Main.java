public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5.0);
        Quadrado q = new Quadrado(2);

        imprimeArea(c);
        imprimeArea(q);
    }

    private static void imprimeArea(FiguraGeometrica f){
        System.out.println("A área é: " + f.getArea());
    }
}
