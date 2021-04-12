package settergetter;

import javax.swing.JOptionPane;

public class SetterGetter {
    public static void main(String[] args) {
        //Membuat objek 
        SetGet hai = new SetGet();
        //Menggunakan OptionePane agar hasil outpunya terdapat pada kotak dialog
        String Email = JOptionPane.showInputDialog("Masukkan Email      : ");
        String Password = JOptionPane.showInputDialog("Masukkan Password : ");
        
        //Pemanggilan Method yang ada di Class SetGet
        hai.setNama("Tasya Syafira Sinrani");
        hai.setNisn("0345668699970");
        hai.setJenisKelimain("Perempuan");
        hai.setAlamat("Ds. Bulusari, Kec. Kedungwaru, Kab. Tulungagung");
        hai.setHP("082 339 543 169");

        //Pemanggilan method di Class SetGet dan tampilan output
        System.out.println("+------------------------------------------+");
        System.out.println("|          Biodata Siswa Moklet           |");
        System.out.println("+------------------------------------------+");
        System.out.println("| Nama\t\t: " + hai.getNama());
        System.out.println("| NISN\t\t: " + hai.getNisn());
        System.out.println("| Jenis Kelamin\t: " + hai.getJenisKelimain());
        System.out.println("| Alamat\t: " + hai.getAlamat());
        System.out.println("| Nomor HP\t: " + hai.getHP());
        System.out.println("+------------------------------------------+");
    }
    
}
