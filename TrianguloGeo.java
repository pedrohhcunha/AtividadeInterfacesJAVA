public class TrianguloGeo extends FormaGeo{
    Integer base;
    Integer altura;

    public TrianguloGeo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    Integer area() {
        return ( base * altura ) / 2;
    }
    
}
