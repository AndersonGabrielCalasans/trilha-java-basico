public class Quadrado implements FiguraGeometrica {

    private int lado;

    public int getLado(){
        return lado;
    }

    public void setLado(int lado){
        this.lado = lado;
    }

    public Quadrado(int lado){
        this.lado = lado;
    }
    

    @Override
    public String getNomeFigura() {
        return "quadrado";
    }

    @Override
    public double getArea() {
        int area = 0;
        area = lado * lado;
        return area;
    }

    @Override
    public double getPerimetro() {
        int perimetro = 0;
        perimetro = lado * 4;
        return perimetro;
    }
    
}
