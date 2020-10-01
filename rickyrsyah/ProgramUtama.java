package rickyrsyah;

public class ProgramUtama {
    public static void main(String[] args) {
        // luas yang dibutuhkan adalah luas minimum dengan nilai
        // 1.000.000cm^2 atau 100m^2
        int luasMinimum = 1000000;

        // mendefinsikan tiap keramik beserta nilainya 
        Keramik keramikA = new Keramik("Keramik A", 30, 30);
        keramikA.jumlahPerBox = 10;
        keramikA.hargaPerBox = 54000;

        Keramik keramikB = new Keramik("Keramik B", 40, 40);
        keramikB.jumlahPerBox = 5;
        keramikB.hargaPerBox = 65000;

        Keramik keramikC = new Keramik("Keramik C", 30, 40);
        keramikC.jumlahPerBox = 8;
        keramikC.hargaPerBox = 60000;

        // membandingkan tiap keramik berdasarkan luas minimum
        // dengan menggunakan Math.ceil() untuk pembulatan keatas
        int minBoxKeramikA = (int) Math.ceil(luasMinimum / keramikA.luasPerBox());
        int minBoxKeramikB = (int) Math.ceil(luasMinimum / keramikB.luasPerBox());
        int minBoxKeramikC = (int) Math.ceil(luasMinimum / keramikC.luasPerBox());
        int totalHargaKeramikA = minBoxKeramikA * keramikA.hargaPerBox;
        int totalHargaKeramikB = minBoxKeramikB * keramikB.hargaPerBox;
        int totalHargaKeramikC = minBoxKeramikC * keramikC.hargaPerBox;

        // menampilkan semua total harga tiap keramik
        System.out.println("Untuk "+ keramikA.label + " membutuhkan biaya sebesar Rp " + totalHargaKeramikA);
        System.out.println("Untuk "+ keramikB.label + " membutuhkan biaya sebesar Rp " + totalHargaKeramikB);
        System.out.println("Untuk "+ keramikC.label + " membutuhkan biaya sebesar Rp " + totalHargaKeramikC);
        System.out.println();

        // memilih yang paling murah
        if (totalHargaKeramikA < totalHargaKeramikB) {
            if (totalHargaKeramikA < totalHargaKeramikC) {
                System.out.println("Didapat harga paling murah untuk "+keramikA.label);
                System.out.println("Yaitu dengan harga: Rp "+totalHargaKeramikA);
                System.out.println("Hemat Rp "+(totalHargaKeramikB-totalHargaKeramikA)+" dari"+keramikB.label);
                System.out.println("Hemat Rp "+(totalHargaKeramikC-totalHargaKeramikA)+" dari"+keramikC.label);
            } else {
                System.out.println("Didapat harga paling murah untuk "+keramikC.label);
                System.out.println("Yaitu dengan harga: Rp "+totalHargaKeramikC);
                System.out.println("Hemat Rp "+(totalHargaKeramikA-totalHargaKeramikC)+" dari"+keramikA.label);
                System.out.println("Hemat Rp "+(totalHargaKeramikB-totalHargaKeramikC)+" dari"+keramikB.label);
            }
        } else if (totalHargaKeramikB < totalHargaKeramikC) {
            System.out.println("Didapat harga paling murah untuk "+keramikB.label);
            System.out.println("Yaitu dengan harga: Rp "+totalHargaKeramikB);
            System.out.println("Hemat Rp "+(totalHargaKeramikA-totalHargaKeramikB)+" dari"+keramikA.label);
            System.out.println("Hemat Rp "+(totalHargaKeramikC-totalHargaKeramikB)+" dari"+keramikC.label);
        }
    }
}