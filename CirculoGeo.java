public class CirculoGeo extends FormaGeo{
    Integer raio;


    public CirculoGeo(Integer raio) {
        this.raio = raio;
    }

    Integer area() {
        return 3 * ( raio * raio );
    }
}
