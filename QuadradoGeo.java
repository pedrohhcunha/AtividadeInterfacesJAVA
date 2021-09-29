public class QuadradoGeo extends FormaGeo{
    Integer lado;

    public QuadradoGeo(Integer lado) {
        this.lado = lado;
    }

    Integer area() {
        return lado * lado;
    }
}
