public class Audio extends ElementoMultimediale implements Riproducibile {

    private int volume;
    private int durata;

    public Audio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    @Override
    public void esegui() {
        play();
    }

    @Override
    public void play() {
        for (int i = 0; i <= durata; i++) {
            System.out.println(titolo + "!".repeat(volume));
        }
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void abbassaVolume() {
        volume--;
    }
}





