package Challenge;
import java.util.Scanner;

class Tabung {
    private double radius;
    private double tinggi;


    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * radius * radius * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }

    public void tampilkanInfo() {
        System.out.println("Tabung:");
        System.out.println("Radius: " + radius);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan());
    }
}

class LimasSegitiga {
    private double sisiAlas;
    private double tinggiSegitiga;
    private double tinggiLimas;


    public LimasSegitiga(double sisiAlas, double tinggiSegitiga, double tinggiLimas) {
        this.sisiAlas = sisiAlas;
        this.tinggiSegitiga = tinggiSegitiga;
        this.tinggiLimas = tinggiLimas;
    }

    private double luasAlas() {
        return (sisiAlas * tinggiSegitiga) / 2;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * luasAlas() * tinggiLimas;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = this.luasAlas();
        double luasSisi = 3 * ((sisiAlas * tinggiLimas) / 2);
        return luasAlas + luasSisi;
    }

    public void tampilkanInfo() {
        System.out.println("Limas Segitiga:");
        System.out.println("Sisi Alas: " + sisiAlas);
        System.out.println("Tinggi Segitiga: " + tinggiSegitiga);
        System.out.println("Tinggi Limas: " + tinggiLimas);
        System.out.println("Volume: " + hitungVolume());
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan());
    }
}

class LuasKelilingTrapesium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Volume dan Luas Permukaan");

        System.out.print("Masukkan radius tabung: ");
        double radius = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggiTabung = scanner.nextDouble();

        Tabung tabung = new Tabung(radius, tinggiTabung);
        tabung.tampilkanInfo();

        System.out.print("\nMasukkan sisi alas limas segitiga: ");
        double sisiAlas = scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = scanner.nextDouble();
        System.out.print("Masukkan tinggi limas: ");
        double tinggiLimas = scanner.nextDouble();

        LimasSegitiga limas = new LimasSegitiga(sisiAlas, tinggiSegitiga, tinggiLimas);
        limas.tampilkanInfo();

        scanner.close();
    }
}
