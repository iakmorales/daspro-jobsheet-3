import java.util.Scanner;
public class Siakad24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        byte absen;
        double nilaiKuis = 0.2, nilaiTugas = 0.15, nilaiUts = 0.3, nilaiUas = 0.35, NilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUas = sc.nextDouble();

        NilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUts * 0.3) + (nilaiUas * 0.35);
        
        //System.out.println("Nama: " + nama + "NIM: " + nim);
        //System.out.println("Kelas: " + kelas + "Absen: " + absen);
        System.out.println(String.format("Mahasiswa dengan nama %s (NIM %s) kelas %s nomor absen %d", nama, nim, kelas, absen));
        System.out.println("Nilai Akhir: " + NilaiAkhir);
    }
}
