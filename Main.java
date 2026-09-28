package inventori;

import inventori.model.Barang;

public class Main {

    public static void main(String[] args) {
        Barang barang = new Barang(
                "BRG-001",
                "Mouse USB",
                "Periferal",
                10,
                "Lab 1");

        System.out.println(
                "SISTEM INVENTORI LABORATORIUM");

        System.out.println(barang.tampilkanInfo());

        System.out.println(
                "Kerangka proyek siap. "
                + "Data masih berada di memori.");
    }
}