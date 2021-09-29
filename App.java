public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("PROGRAMA DO JEFFERSSON");

        QuadradoGeo quadrado = new QuadradoGeo(5);
        quadrado.rotacionar();
        quadrado.desenhar();
        System.out.println(quadrado.area());

        TrianguloGeo triangulo = new TrianguloGeo(5, 2);
        triangulo.rotacionar();
        triangulo.desenhar();
        System.out.println(triangulo.area());

        CirculoGeo circulo = new CirculoGeo(5);
        circulo.rotacionar();
        circulo.desenhar();
        System.out.println(circulo.area());
    }
}
