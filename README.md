# PBO Post Test 2
Nama          : Aristy Avrianti
NIM           : 2209116027
Kelas         : Sistem Informasi'A 22
Mata Kuliah   : Pemrograman Berorientasi Objek

Pada source package utama terdapat 2 package yaitu, kedai seblak dan menu. Pada package kedai seblak terdapat class "SeblakStore.java" sebagai Main Class. Di dalam class tersebut terdapat program sebagai berikut :

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/c13d6938-2e71-4c20-91d1-1a164fd7525e)
**"package kedaiseblak;"** ini adalah pernyataan yang mendefinisikan paket (package) tempat kelas-kelas Java dalam file ini berada. Dalam hal ini, kelas-kelas Java tersebut dimasukkan ke dalam paket dengan nama kedaiseblak.
**"import java.util.Scanner;"** ini adalah pernyataan yang mengimport kelas Scanner dari paket java.util. Kelas Scanner digunakan untuk membaca input dari pengguna.
**"import menu.*;"** ini adalah pernyataan impor yang mengimport semua kelas dalam paket menu. tanda * digunakan untuk menunjukkan bahwa semua kelas dalam paket menu akan diimpor ke dalam file Java ini. Penggunaan ini bertujuan menggunakan kelas-kelas dari paket menu dalam file Java ini tanpa menyebutkan nama paket secara eksplisit setiap kali Anda menggunakan kelas dari paket tersebut.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/bd264fb4-ace8-43a3-a20a-2559cbe01540)
**"public class SeblakStore {"** ini adalah deklarasi kelas SeblakStore. Kata kunci public menunjukkan bahwa kelas ini dapat diakses dari kelas lain di luar paket. Kata kunci class menunjukkan bahwa ini adalah sebuah definisi kelas. Nama kelasnya adalah SeblakStore. Kurung buka { menandakan awal dari blok kode untuk kelas ini.
**"public static void main(String[] args) {"** ini adalah metode utama (entry point) dari program. Metode ini akan dijalankan pertama kali saat program dimulai. Kata kunci public menunjukkan bahwa metode ini dapat diakses dari luar kelas. Kata kunci static berarti bahwa metode ini adalah metode statis dan dapat dipanggil tanpa membuat objek dari kelas SeblakStore. Tipe data void menunjukkan bahwa metode ini tidak mengembalikan nilai apa pun. main adalah nama metodenya. (String[] args) adalah parameter metode, yang adalah sebuah array dari string.
**"Scanner scanner = new Scanner(System.in);"** ini adalah deklarasi variabel yang menggunakan kelas Scanner untuk membaca input dari pengguna. Variabel scanner diinisialisasi dengan objek dari kelas Scanner yang menggunakan System.in sebagai sumber inputnya. Ini memungkinkan program untuk membaca input dari pengguna melalui konsol.
**"int menuStore;"** ini adalah deklarasi variabel bertipe data integer dengan nama menuStore. Variabel ini digunakan untuk menyimpan nilai menu yang dipilih oleh pengguna.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/f8e1c294-7889-4b25-87e0-addf8e3de752)
**"while (true) {"** ini adalah loop while yang memiliki kondisi true, yang berarti loop ini akan terus berjalan selama kondisi ini benar (selamanya). Dalam konteks ini, program akan terus menampilkan menu dan membaca input dari pengguna hingga pengguna memilih opsi "10. Exit" untuk keluar dari loop.
Di sini, program menunggu pengguna memasukkan angka pilihan menu. **"scanner.nextInt()"** digunakan untuk membaca integer yang dimasukkan oleh pengguna. Nilai ini kemudian disimpan dalam variabel menuStore. Setelah itu, **"scanner.nextLine()"** digunakan untuk membersihkan karakter baru (newline) dari buffer input, sehingga input berikutnya tidak terpengaruh oleh karakter newline sebelumnya.





