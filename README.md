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

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/c3a8853a-2817-4b92-bc55-2ef658cfbf7a)

**"switch (menuStore) {"** ini adalah konstruksi switch statement. Nilai dari variabel menuStore akan dibandingkan dengan nilai-nilai dalam kasus-kasus (case) yang ada di dalam blok switch ini.

**"case 1:"** ini adalah kasus pertama di dalam switch statement. Jika nilai menuStore adalah 1, program akan menampilkan pesan menu "Spicy Seblak" ke layar. Kemudian program menunggu pengguna memasukkan ID, nama, harga, dan tingkat kepedasan Spicy Seblak. Variabel-variabel ini kemudian digunakan untuk membuat objek SpicySeblak.

**"Menu.addSpicySeblak(new SpicySeblak(idSpicy, nameSpicy, priceSpicy, levelSpicy));"** ini adalah bagian yang menambahkan objek SpicySeblak baru ke dalam menu. Metode addSpicySeblak merupakan bagian dari kelas Menu yang berguna untul menambahkan item Spicy Seblak ke dalam menu.

**"break;"** ini adalah pernyataan break yang menghentikan eksekusi dari switch statement. Setelah menjalankan kode dalam satu kasus, program akan keluar dari switch statement.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/93c7db76-bf42-4988-9a91-53af7287c4a0)

**"case 2:"** ini adalah kasus kedua di dalam switch statement. Jika nilai menuStore adalah 2, program akan menampilkan pesan menu "Cheese Seblak" ke layar. Kemudian, program menunggu pengguna memasukkan ID, nama, harga, dan tipe keju Cheese Seblak. Variabel-variabel ini kemudian digunakan untuk membuat objek CheeseSeblak.

**"Menu.addCheeseSeblak(new CheeseSeblak(idCheese, nameCheese, priceCheese, cheeseType));"** ini adalah bagian yang menambahkan objek CheeseSeblak baru ke dalam menu. Metode addCheeseSeblak merupakan bagian dari kelas Menu yang berguna untuk menambahkan item Cheese Seblak ke dalam menu.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/ff7023b1-1117-4a79-80d8-28773ca8227e)

**"case 3:"** ini adalah kasus ketiga di dalam switch statement. Jika nilai menuStore adalah 3, program akan menampilkan pesan menu "Spicy Seblak" ke layar. 

**"System.out.print("> ID: ");
String idRemoveSpicy = scanner.nextLine();"** program menunggu pengguna memasukkan ID Spicy Seblak yang ingin dihapus dari menu.

**"if (!Menu.checkIdSpicy(idRemoveSpicy)) {
    System.out.println("ID not found!");
    break;
}"** program memanggil metode checkIdSpicy dari kelas Menu untuk memeriksa apakah ID Spicy Seblak yang dimasukkan oleh pengguna ada dalam menu atau tidak. Jika ID tidak ditemukan, program akan mencetak pesan "ID not found!" dan keluar dari switch statement menggunakan pernyataan break.

**"Menu.removeSpicySeblak(idRemoveSpicy);
System.out.println("Spicy Seblak with ID " + idRemoveSpicy + " has been removed!");"** Jika ID ditemukan, program memanggil metode removeSpicySeblak dari kelas Menu untuk menghapus objek Spicy Seblak dengan ID tersebut dari menu. Program kemudian mencetak pesan konfirmasi bahwa Spicy Seblak dengan ID yang dimasukkan telah dihapus.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/0f73d03c-0e67-4277-912a-c0b28eb292af)

**"case 4:"** ini adalah kasus keempat di dalam switch statement. Jika nilai menuStore adalah 4, program akan menampilkan pesan menu "Cheese Seblak" ke layar.

**"System.out.print("> ID: ");
String idRemoveCheese = scanner.nextLine();"** program menunggu pengguna memasukkan ID Cheese Seblak yang ingin dihapus dari menu.

**"if (!Menu.checkIdCheese(idRemoveCheese)) {
    System.out.println("ID not found!");
    break;
}"** program memanggil metode checkIdCheese dari kelas Menu untuk memeriksa apakah ID Cheese Seblak yang dimasukkan oleh pengguna ada dalam menu atau tidak. Jika ID tidak ditemukan, program akan mencetak pesan "ID not found!" dan keluar dari switch statement menggunakan pernyataan break.

**"Menu.removeCheeseSeblak(idRemoveCheese);
System.out.println("Cheese Seblak with ID " + idRemoveCheese + " has been removed!");"** Jika ID ditemukan, program memanggil metode removeCheeseSeblak dari kelas Menu untuk menghapus objek Cheese Seblak dengan ID tersebut dari menu. Program kemudian mencetak pesan konfirmasi bahwa Cheese Seblak dengan ID yang dimasukkan telah dihapus.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/41bb8fba-1f23-49cb-ba7b-fbb2c8a00871)

**"case 5:"** ini adalah kasus kelima di dalam switch statement. Jika nilai menuStore adalah 5, program akan menjalankan metode printAllMenu() dari objek Menu. Metode ini ditujukan untuk mencetak semua item menu yang ada.

**"Menu.printAllMenu();"** ini adalah panggilan ke metode printAllMenu() yang telah didefinisikan di dalam kelas Menu. Metode ini bertanggung jawab untuk mencetak semua item menu yang ada di dalam objek Menu.

**""case 6:"** ini adalah kasus keenam di dalam switch statement. Jika nilai menuStore adalah 6, program akan menjalankan metode printSpicySeblak() dari objek Menu. Metode ini ditujukan untuk mencetak semua item menu Spicy Seblak yang ada.

**"Menu.printSpicySeblak();"** ini adalah panggilan ke metode printSpicySeblak() yang telah didefinisikan di dalam kelas Menu. Metode ini bertanggung jawab untuk mencetak semua item menu Spicy Seblak yang ada di dalam objek Menu.

**"case 7:"** ini adalah kasus ketujuh di dalam switch statement. Jika nilai menuStore adalah 7, program akan menjalankan metode printCheeseSeblak() dari objek Menu. Metode ini ditujukan untuk mencetak semua item menu Cheese Seblak yang ada.

**"Menu.printCheeseSeblak();"** ini adalah panggilan ke metode printCheeseSeblak() yang telah didefinisikan di dalam kelas Menu. Metode ini bertanggung jawab untuk mencetak semua item menu Cheese Seblak yang ada di dalam objek Menu.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/e36c6d5c-97af-4962-adc7-9c6a73c54364)

**"case 8:"** Ini adalah kasus kedelapan di dalam switch statement. Jika nilai menuStore adalah 8, program akan menampilkan pesan menu "Spicy Seblak" ke layar.

**"System.out.print("> ID: ");
String idUpdateSpicy = scanner.nextLine();"** program menunggu pengguna memasukkan ID Spicy Seblak yang ingin diperbarui.

**"if (!Menu.checkIdSpicy(idUpdateSpicy)) {
    System.out.println("ID not found!");
    break;
}"** program memanggil metode checkIdSpicy dari kelas Menu untuk memeriksa apakah ID Spicy Seblak yang dimasukkan oleh pengguna ada dalam menu atau tidak. Jika ID tidak ditemukan, program akan mencetak pesan "ID not found!" dan keluar dari switch statement menggunakan pernyataan break.

**"System.out.print("> Name: ");
String nameUpdateSpicy = scanner.nextLine();
System.out.print("> Price: ");
int priceUpdateSpicy = scanner.nextInt();
scanner.nextLine();
System.out.print("> Level Spicy: ");
String levelUpdateSpicy = scanner.nextLine();"** 
Program menunggu pengguna memasukkan data baru untuk Spicy Seblak yang ingin diperbarui.

**"Menu.updateSpicySeblak(idUpdateSpicy, nameUpdateSpicy, priceUpdateSpicy, levelUpdateSpicy);"** Metode ini bertugas untuk memperbarui objek Spicy Seblak dalam menu dengan data baru yang dimasukkan oleh pengguna.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/60451368-efec-40a1-9207-9f3ea6283988)

**"case 9:"** ini adalah kasus kesembilan di dalam switch statement. Jika nilai menuStore adalah 9, program akan menampilkan pesan menu "Cheese Seblak" ke layar.

**"System.out.print("> ID: ");
String idUpdateCheese = scanner.nextLine();"** Program menunggu pengguna memasukkan ID Cheese Seblak yang ingin diperbarui.

**"if (!Menu.checkIdCheese(idUpdateCheese)) {
    System.println("ID not found!");
    break;
}"** Program memanggil metode checkIdCheese dari kelas Menu untuk memeriksa apakah ID Cheese Seblak yang dimasukkan oleh pengguna ada dalam menu atau tidak. Jika ID tidak ditemukan, program akan mencetak pesan "ID not found!" dan keluar dari switch statement menggunakan pernyataan break.

**"System.out.print("> Name: ");
String nameUpdateCheese = scanner.nextLine();
System.out.print("> Price: ");
int priceUpdateCheese = scanner.nextInt();
scanner.nextLine();
System.out.print("> Cheese Type: ");
String cheeseUpdateType = scanner.nextLine();"** Program menunggu pengguna memasukkan data baru untuk Cheese Seblak yang ingin diperbarui.

**"Menu.updateCheeseSeblak(idUpdateCheese, nameUpdateCheese, priceUpdateCheese, cheeseUpdateType);"** Metode ini bertugas untuk memperbarui objek Cheese Seblak dalam menu dengan data baru yang dimasukkan oleh pengguna.

**"case 10:"** Ini adalah kasus kesepuluh di dalam switch statement. Jika nilai menuStore adalah 10, program akan keluar dari program secara keseluruhan dengan menggunakan System.exit(0). Ini adalah cara untuk mengakhiri program.

**"default:"** Ini adalah blok yang akan dijalankan jika menuStore tidak cocok dengan salah satu dari kasus di atas. Dalam blok default, program mencetak pesan "Wrong input!" yang menandakan bahwa pengguna telah memasukkan pilihan yang salah atau tidak valid.

Selanjutnya kita ke package kedua yaitu package **"menu"** yang berisi class **"CheeseSeblak.java, Menu.java, SeblakProduct.java, SpicySeblak.java"**.

Pertama, kita akan membahas class pertama yaitu **"CheeseSeblak.java"**.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/023cfb44-7e1f-41ef-9487-582fecbd64f6)

**"package menu;"** ini adalah deklarasi paket (package) di mana kelas CheeseSeblak berada. Paket ini digunakan untuk mengelompokkan kelas-kelas terkait bersama dalam satu direktori.

**"public class CheeseSeblak extends SeblakProduct {"** ini adalah deklarasi kelas CheeseSeblak yang merupakan turunan dari kelas SeblakProduct. Dengan kata lain, CheeseSeblak adalah subkelas dari SeblakProduct dan mewarisi sifat dan perilaku dari kelas induknya.

**"private String cheeseType;"** ini adalah deklarasi variabel instance cheeseType yang merupakan tipe data String. Variabel ini digunakan untuk menyimpan informasi tentang jenis keju (cheese type) dari produk Cheese Seblak.

**"public CheeseSeblak(String idProduct, String nameProduct, int priceProduct, String cheeseType) { ... }"** ini adalah konstruktor kelas CheeseSeblak. Konstruktor ini digunakan untuk membuat objek CheeseSeblak baru dengan menginisialisasi nilai dari variabel-instance (idProduct, nameProduct, priceProduct, dan cheeseType) saat objek dibuat.

**"public final String getCheeseType() { ... }"** ini adalah metode getter (getCheeseType()) yang digunakan untuk mengambil nilai variabel cheeseType. Metode ini bersifat final, yang berarti tidak dapat di-overide oleh subkelas.

**"public void setLevelCheese(String cheeseType) { ... }"** ini adalah metode setter (setLevelCheese()) yang digunakan untuk mengatur nilai variabel cheeseType dengan nilai yang baru.

**"@Override"** ini adalah anotasi @Override yang menunjukkan bahwa metode yang berada di bawahnya (printProduct()) akan meng-override (melakukan substitusi) metode dengan nama yang sama dari kelas induk (SeblakProduct).

**"public void printProduct() { ... }"** ini adalah implementasi metode printProduct() yang diwarisi dari kelas SeblakProduct. Metode ini mencetak informasi produk Cheese Seblak, termasuk ID, nama, harga, dan jenis keju (cheese type).

