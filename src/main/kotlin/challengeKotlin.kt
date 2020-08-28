import java.awt.SystemColor.menu
import java.util.Scanner;

public var input = Scanner(System.`in`)

fun main() {
    //membuat objek scanner
    val input = Scanner(System.`in`)

    //Menginputkan Identitas
    print("Nama: ")
    val nama: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        println("Mohon Untuk Diisi")
        main()
    }
    print("Kelas: ")
    val kelas: String? = input.nextLine()
    if(kelas.isNullOrEmpty()){
        print("Mohon Untuk Diisi")
        main()
    }
    print("Nomor Absen: ")
    val absen: String? = input.nextLine()
    println("\t")
    println("\t")

    println("MENGHITUNG VOLUME BANGUN RUANG")
    println("1. Volume Balok")
    println("2. Volume Bola")
    print("Masukkan Menu Pilihan : ")
    val menu = readLine()

    when (menu) {
        "1" -> {
            println("==Menghitung Volume Balok==")
            print("Masukkan Panjang Balok : ")
            val p: Double = input.nextDouble()
            print("Masukkan Lebar Balok : ")
            val l: Double = input.nextDouble()
            print("Masukkan Tinggi Balok : ")
            val t: Double = input.nextDouble()

            //menghitung Balok
            val vt: Double = p * l * t;

            //cetak hasil
            println("Volume Balok adalah = $vt ")

            //kembali ke menu
            println("Kembali ke menu [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else{
                println("Tekan Enter Untuk Kembali")
            }

        }
        "2" -> {
            println("==Menghitung Volume Bola==")
            print("Masukkan jari-jari Bola : ")
            val r: Double = input.nextDouble()

            //menghitung Bola
            val vb: Double = 4/3 * Math.PI * r * r * r;

            //cetak hasil
            println("Volume Bola adalah = $vb ")

            //kembali ke menu
            println("Kembali ke menu [Y/N] : ")
            val next1 = readLine()
            if(next1=="Y" || next1=="y"){
                main()
            }
            else{
                println("Tekan Enter Untuk Kembali")
            }

        }
        else-> {
            println("Menu Tidak Tersedia")
        }
    }
}