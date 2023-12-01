public class Immagine  extends ElementoMultimediale{

    private int lumonisita;

    public Immagine(String titolo, int lumonisita) {
        super(titolo);
        this.lumonisita = lumonisita;
    }

    public void show() {
        System.out.println(titolo + "*".repeat(lumonisita));
    }

    @Override
    public void esegui() {
        show();
    }
}


