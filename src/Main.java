        import java.util.Scanner;

        public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ElementoMultimediale[] elementi = new ElementoMultimediale[5];

                for (int i = 0; i < elementi.length; i++) {
                        System.out.println("Inserisci il tipo di elemento multimediale (1 = Audio, 2 = Video, 3 = Immagine):");
                        int tipo = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Inserisci il titolo dell'elemento:");
                        String titolo = scanner.nextLine();

                        switch (tipo) {
                                case 1:
                                        System.out.println("Inserisci la durata:");
                                        int durataAudio = scanner.nextInt();
                                        System.out.println("Inserisci il volume:");
                                        int volumeAudio = scanner.nextInt();
                                        elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                                        break;
                                case 2:
                                        System.out.println("Inserisci la durata:");
                                        int durataVideo = scanner.nextInt();
                                        System.out.println("Inserisci il volume:");
                                        int volumeVideo = scanner.nextInt();
                                        System.out.println("Inserisci la luminosità:");
                                        int luminositaVideo = scanner.nextInt();
                                        elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                                        break;
                                case 3:
                                        System.out.println("Inserisci la luminosità:");
                                        int luminositaImmagine = scanner.nextInt();
                                        elementi[i] = new Immagine(titolo, luminositaImmagine);
                                        break;
                        }


                }
                scanner.close();








        }

}
