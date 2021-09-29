abstract public class FormaGeo implements Rotacionavel, Desenhavel{
    abstract Integer area();

    public void rotacionar(){
        System.out.println("Rotacionando!");
    }

    public void desenhar(){
        System.out.println("Desenhando!");
    }
}
