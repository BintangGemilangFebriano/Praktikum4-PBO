/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

import java.util.ArrayList;
import java.util.Iterator;

public class ManajemenAset {

    // ArrayList untuk menyimpan objek AsetIT
    ArrayList<AsetIT> daftarAset = new ArrayList<>();

    // Menambahkan aset
    public void tambahAset(AsetIT asetBaru) {
        daftarAset.add(asetBaru);
    }

    // Menampilkan semua aset menggunakan for-each
    public void tampilkanSemuaAset() {
        System.out.println("=== DAFTAR SELURUH ASET IT ===");

        for (AsetIT aset : daftarAset) {
            aset.tampilkanInfoAset();
        }
    }

    // Menghapus aset menggunakan Iterator
    public void hapusAset(String idAset) {
        Iterator<AsetIT> iterator = daftarAset.iterator();
        boolean ditemukan = false;

        while (iterator.hasNext()) {
            AsetIT aset = iterator.next();

            if (aset.idAset.equals(idAset)) {
                iterator.remove();

                System.out.println(
                    "Aset dengan ID " + idAset + " berhasil dihapus."
                );

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println(
                "Aset dengan ID " + idAset + " tidak ditemukan."
            );
        }
    }
}