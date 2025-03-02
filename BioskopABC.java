class Film {
    String judul, genre, jamTayang;
    double hargaTiket;

    Film(String judul, String genre, String jamTayang, double hargaTiket) {
        this.judul = judul;
        this.genre = genre;
        this.jamTayang = jamTayang;
        this.hargaTiket = hargaTiket;
    }
}

class Studio {
    int nomorStudio;
    Film film;

    Studio(int nomorStudio, Film film) {
        this.nomorStudio = nomorStudio;
        this.film = film;
    }
}

class Tiket {
    static int nomor = 1;
    int nomorTiket, nomorKursi;
    String namaPenonton;
    Film film;
    Studio studio;

    Tiket(Film film, Studio studio, int nomorKursi, String namaPenonton) {
        this.nomorTiket = nomor++;
        this.film = film;
        this.studio = studio;
        this.nomorKursi = nomorKursi;
        this.namaPenonton = namaPenonton;
    }
}

public class BioskopABC {
    public static void main(String[] args) {
        Film film1 = new Film("Lamaran Gas LPG 3kg", "Romansa", "18:00", 50000);
        Film film2 = new Film("Dosen Goib", "Horor", "14:00", 40000);
        Film film3 = new Film("Ada Apa Dengan Pertamina", "Kriminal", "20:00", 45000);
        
        Studio studio1 = new Studio(1, film1);
        Studio studio2 = new Studio(2, film2);
        Studio studio3 = new Studio(3, film3);
        
        Tiket tiket1 = new Tiket(film1, studio1, 10, "Dono");
        Tiket tiket2 = new Tiket(film2, studio2, 5, "Kasino");
        Tiket tiket3 = new Tiket(film3, studio3, 15, "Indro");
        
        System.out.println("Tiket " + tiket1.nomorTiket + ": " + tiket1.namaPenonton + " menonton " + tiket1.film.judul + " di Studio " + tiket1.studio.nomorStudio + " (Kursi " + tiket1.nomorKursi + ")");
        System.out.println("Tiket " + tiket2.nomorTiket + ": " + tiket2.namaPenonton + " menonton " + tiket2.film.judul + " di Studio " + tiket2.studio.nomorStudio + " (Kursi " + tiket2.nomorKursi + ")");
        System.out.println("Tiket " + tiket3.nomorTiket + ": " + tiket3.namaPenonton + " menonton " + tiket3.film.judul + " di Studio " + tiket3.studio.nomorStudio + " (Kursi " + tiket3.nomorKursi + ")");
    }
}
