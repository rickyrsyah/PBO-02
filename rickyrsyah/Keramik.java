package rickyrsyah;

class Keramik {
    protected String label;
    protected int panjang;
    protected int lebar;
    protected int jumlahPerBox;
    protected int hargaPerBox;

    Keramik(String label) {
        this.label = label;
    }

    Keramik(String label, int panjang, int lebar) {
        this.label = label;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    protected int luasPerBox() {
        return this.panjang * this.lebar;
    }
}