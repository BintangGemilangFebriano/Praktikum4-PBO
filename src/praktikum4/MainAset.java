/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

public class MainAset {

    public static void main(String[] args) {

        ManajemenAset manajemen = new ManajemenAset();

        manajemen.tambahAset(
            new AsetIT("A001", "Server", "Ruang Server", "Baik")
        );

        manajemen.tambahAset(
            new AsetIT("A002", "Router", "Ruang Jaringan", "Baik")
        );

        manajemen.tambahAset(
            new AsetIT("A003", "Switch", "Ruang Jaringan", "Rusak")
        );

        manajemen.tambahAset(
            new AsetIT("A004", "PC", "Laboratorium", "Baik")
        );

        System.out.println("DATA AWAL ASET IT");
        manajemen.tampilkanSemuaAset();

        System.out.println("\nPROSES PENGHAPUSAN");
        manajemen.hapusAset("A003");

        System.out.println("\nDATA SETELAH PENGHAPUSAN");
        manajemen.tampilkanSemuaAset();
    }
}