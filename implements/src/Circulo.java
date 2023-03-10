public class Circulo implements FiguraGeometrica {

    private double raio;

    public double getRaio(){
        return raio;
    }

    public void setRaio(int raio){
        this.raio = raio;
    }
    
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String getNomeFigura() {
        return "circulo";
    }

    @Override
    public double getArea() {
        double area = 0;
        area = Math.PI * raio * raio;
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro = 0;
        perimetro = 2 * Math.PI * raio;
        return perimetro;
    }
    
}
