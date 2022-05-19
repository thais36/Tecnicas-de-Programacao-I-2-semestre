public class Quadrado extends Forma{
    private float base;

    public Quadrado(float b) {base = b; }

    public float getBase() {return base; }
    public void setBase(float b) {base = b; }

    public float perimetro(){
        return base*4;
    }

    public float area(){
        return base*base;
    }
    public void mostra(){
        System.out.println("Base: " + base + "\nPerimetro: " + perimetro() + "\nArea: " +area());
    }
}