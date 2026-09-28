package inventori.model;

public class Barang {

    private String kode;
    private String nama;
    private String kategori;
    private int stok;
    private String keterangan;

    public Barang(
            String kode,
            String nama,
            String kategori,
            int stok,
            String keterangan) {

        setKode(kode);
        setNama(nama);
        setKategori(kategori);
        setStok(stok);
        setKeterangan(keterangan);
    }

    private static String wajibIsi(String nilai, String label) {
        if (nilai == null || nilai.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    label + " tidak boleh kosong.");
        }

        return nilai.trim();
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = wajibIsi(kode, "Kode");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = wajibIsi(nama, "Nama");
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = wajibIsi(kategori, "Kategori");
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok < 0) {
            throw new IllegalArgumentException(
                    "Stok tidak boleh negatif.");
        }

        this.stok = stok;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan =
                keterangan == null ? "" : keterangan.trim();
    }

    public String tampilkanInfo() {
        return kode + " | " + nama
                + " | " + kategori
                + " | Stok: " + stok;
    }
}