public class Video extends ElementoMultimediale implements Riproducibile {

    private int volume;
    private int luminosita;
    int durata;

    public Video(String titolo, int volume, int luminosita, int durata) {
        super(titolo);
        this.volume = volume;
        this.luminosita = luminosita;
        this.durata = durata;
    }

    public void aumentaLuminosita (){
        luminosita++;
    }
    public void abbassaLuminosita (){
        luminosita--;
    }


    @Override
    public void esegui() {

    }

    @Override
    public void play() {
        for (int i = 0; i <= durata; i++) {
            System.out.println(titolo + "!".repeat(volume) + "*".repeat(luminosita));

        }

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }
}
