# PBO Post Test 2
Nama          : Aristy Avrianti

NIM           : 2209116027

Kelas         : Sistem Informasi'A 22

Mata Kuliah   : Pemrograman Berorientasi Objek

Dalam post test kali ini saya menerapkan penggunaan **method yang bersifat static** pada class **Menu.java**. Kemudian saya juga menerapkan **Inheritance atau pewarisan** pada class SpicySeblak.java & CheeseSeblak.java sebagai **child**, dan SeblakProduct.java sebagai **parentnya**. Kemudian untuk penerapan **Polymorphism** yaitu **overriding** terdapat pada class SpicySeblak.java dan CheeseSeblak.java. Sementara, untuk penerapan fitur abstract terdapat pada class **SeblakProduct.java**.

Pada source package utama terdapat 2 package yaitu, kedaiseblak dan menu. Pada package kedaiseblak terdapat class "SeblakStore.java" sebagai Main Class. Di dalam class tersebut terdapat program sebagai berikut :

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

Selanjutnya kita akan ke class kedua, yaitu **"SpicySeblak.java"**

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/80ac059b-695f-4fb2-a857-591710b97ae9)

**"package menu;"** Ini adalah deklarasi paket (package) di mana kelas SpicySeblak berada. Paket ini digunakan untuk mengelompokkan kelas-kelas terkait bersama dalam satu direktori.

**"public class SpicySeblak extends SeblakProduct {"** Ini adalah deklarasi kelas SpicySeblak yang merupakan turunan dari kelas SeblakProduct. Dengan kata lain, SpicySeblak adalah subkelas dari SeblakProduct dan mewarisi sifat dan perilaku dari kelas induknya.

**"private String levelSpicy;"** Ini adalah deklarasi variabel instance levelSpicy yang merupakan tipe data String. Variabel ini digunakan untuk menyimpan informasi tentang tingkat kepedasan (level spicy) dari produk Spicy Seblak.

**"public SpicySeblak(String idProduct, String nameProduct, int priceProduct, String levelSpicy) { ... }"** Ini adalah konstruktor kelas SpicySeblak. Konstruktor ini digunakan untuk membuat objek SpicySeblak baru dengan menginisialisasi nilai dari variabel-instance (idProduct, nameProduct, priceProduct, dan levelSpicy) saat objek dibuat.

**"public final String getLevelSpicy() { ... }"** Ini adalah metode getter (getLevelSpicy()) yang digunakan untuk mengambil nilai variabel levelSpicy. Metode ini bersifat final, yang berarti tidak dapat di-overide oleh subkelas.

**"public void setLevelSpicy(String levelSpicy) { ... }"** Ini adalah metode setter (setLevelSpicy()) yang digunakan untuk mengatur nilai variabel levelSpicy dengan nilai yang baru.

**"@Override"** Ini adalah anotasi @Override yang menunjukkan bahwa metode yang berada di bawahnya (printProduct()) akan meng-override (melakukan substitusi) metode dengan nama yang sama dari kelas induk (SeblakProduct).

**"public void printProduct() { ... }"** Ini adalah implementasi metode printProduct() yang diwarisi dari kelas SeblakProduct. Metode ini mencetak informasi produk Spicy Seblak, termasuk ID, nama, harga, dan tingkat kepedasan (level spicy).

Selanjutnya adalah class yang ketiga yaitu, **"Menu.java"**.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/a8290d88-ac2d-4940-b486-55707d4ac3ff)

**"package menu;"** Ini adalah deklarasi paket (package) di mana kelas Menu berada. Paket ini digunakan untuk mengelompokkan kelas-kelas terkait bersama dalam satu direktori.

**"private static ArrayList<SpicySeblak> spicySeblaks = new ArrayList<>();"** Ini adalah deklarasi variabel statis spicySeblaks yang merupakan ArrayList dari objek SpicySeblak. Variabel ini digunakan untuk menyimpan daftar objek Spicy Seblak dalam menu. Variabel statis berarti bahwa variabel ini milik kelas, bukan objek individu, dan dapat diakses tanpa harus membuat instansiasi objek Menu.

**"private static ArrayList<CheeseSeblak> cheeseSeblaks = new ArrayList<>();"** Ini adalah deklarasi variabel statis cheeseSeblaks yang merupakan ArrayList dari objek CheeseSeblak. Variabel ini digunakan untuk menyimpan daftar objek Cheese Seblak dalam menu.

**"public static void addSpicySeblak(SpicySeblak spicySeblak) { ... }"** Ini adalah metode statis addSpicySeblak yang digunakan untuk menambahkan objek SpicySeblak ke dalam daftar spicySeblaks

**"public static void removeSpicySeblak(String idProduct) { ... }"** Ini adalah metode statis removeSpicySeblak yang digunakan untuk menghapus objek SpicySeblak dari daftar spicySeblaks berdasarkan ID produk.

**"public static void printSpicySeblak() { ... }"** Ini adalah metode statis printSpicySeblak yang digunakan untuk mencetak semua objek SpicySeblak dalam daftar spicySeblaks.

**"public static void updateSpicySeblak(String idProduct, String nameProduct, int priceProduct, String levelSpicy) { ... }"** Ini adalah metode statis updateSpicySeblak yang digunakan untuk memperbarui objek SpicySeblak dalam daftar spicySeblaks berdasarkan ID produk. Metode ini menerima ID produk baru, nama produk baru, harga produk baru, dan tingkat kepedasan baru sebagai parameter.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/87093940-8b37-43d7-9fe1-ada3754c7e66)

**"public static void addCheeseSeblak(CheeseSeblak cheeseSeblak) { ... }"** Metode ini digunakan untuk menambahkan objek CheeseSeblak ke dalam daftar cheeseSeblaks. Objek CheeseSeblak yang diterima sebagai parameter ditambahkan ke ArrayList cheeseSeblaks.

**"public static void removeCheeseSeblak(String idProduct) { ... }"** Metode ini digunakan untuk menghapus objek CheeseSeblak dari daftar cheeseSeblaks berdasarkan ID produk yang diberikan sebagai parameter. Metode ini menggunakan loop untuk mencari objek dengan ID yang sesuai dan menghapusnya dari ArrayList.

**"public static void printCheeseSeblak() { ... }"** Metode ini digunakan untuk mencetak semua objek CheeseSeblak dalam daftar cheeseSeblaks. Metode ini menggunakan loop for-each untuk mengakses setiap objek CheeseSeblak dalam ArrayList dan memanggil metode printProduct() untuk mencetak detail produk.

**"public static void updateCheeseSeblak(String idProduct, String nameProduct, int priceProduct, String levelCheese) { ... }"** Metode ini digunakan untuk memperbarui objek CheeseSeblak dalam daftar cheeseSeblaks berdasarkan ID produk yang diberikan sebagai parameter. Metode ini menggunakan loop untuk mencari objek dengan ID yang sesuai, kemudian memperbarui nama produk, harga produk, dan tingkat keju dengan nilai yang baru yang diberikan sebagai parameter.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/f8050019-c9c2-4f29-84a5-27d886760bb9)

**"public static void printAllMenu() { ... }"** Metode ini digunakan untuk mencetak semua produk dalam menu, baik itu produk Spicy Seblak maupun Cheese Seblak. Metode ini memanggil metode printSpicySeblak() untuk mencetak semua produk Spicy Seblak, dan kemudian memanggil metode printCheeseSeblak() untuk mencetak semua produk Cheese Seblak. Dengan memanggil metode-metode yang sudah ada sebelumnya, metode ini menyajikan semua produk dalam satu tampilan.

**"public static boolean checkIdSpicy(String idSeblakSpicy) { ... }"** Metode ini digunakan untuk memeriksa apakah ID yang diberikan (idSeblakSpicy) cocok dengan salah satu ID produk Spicy Seblak dalam daftar. Metode ini menggunakan loop untuk mencari ID yang sesuai dalam ArrayList spicySeblaks. Jika ID ditemukan, metode mengembalikan true, menunjukkan bahwa ID tersebut ada dalam daftar produk Spicy Seblak. Jika tidak ditemukan, metode mengembalikan false.

**"public static boolean checkIdCheese(String idSeblakCheese) { ... }"** Metode ini mirip dengan checkIdSpicy(), tetapi digunakan untuk memeriksa apakah ID yang diberikan (idSeblakCheese) cocok dengan salah satu ID produk Cheese Seblak dalam daftar cheeseSeblaks. Metode ini juga menggunakan loop untuk mencari ID yang sesuai dalam ArrayList cheeseSeblaks. Jika ID ditemukan, metode mengembalikan true, menunjukkan bahwa ID tersebut ada dalam daftar produk Cheese Seblak. Jika tidak ditemukan, metode mengembalikan false.

Selanjutnya kita akan ke class yang terakhit yaitu, **"SeblakProduct.java"**.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/ba282b27-3aeb-4efa-b90f-632579b68345)

**"abstract public class SeblakProduct { ... }"** Ini adalah deklarasi kelas SeblakProduct sebagai kelas abstrak. Kelas abstrak adalah kelas yang tidak dapat diinstansiasi. Artinya, Anda tidak dapat membuat objek langsung dari kelas ini. Kelas abstrak ini memiliki metode abstrak (yang dideklarasikan tetapi tidak diimplementasikan di kelas ini) yang harus diimplementasikan oleh subkelasnya.

**"private final String idProduct;"** Ini adalah deklarasi variabel instance idProduct yang digunakan untuk menyimpan ID unik produk. Variabel ini ditandai sebagai final, artinya nilainya tidak dapat diubah setelah diinisialisasi.

**"private String nameProduct;"** Ini adalah deklarasi variabel instance nameProduct yang digunakan untuk menyimpan nama produk.

**"private int priceProduct;"** Ini adalah deklarasi variabel instance priceProduct yang digunakan untuk menyimpan harga produk.

**"public SeblakProduct (String idProduct, String nameProduct, int priceProduct) { ... }"** Ini adalah konstruktor kelas SeblakProduct yang digunakan untuk membuat objek SeblakProduct baru. Konstruktor ini mengambil tiga parameter: idProduct, nameProduct, dan priceProduct untuk menginisialisasi variabel-instance dengan nilai yang sesuai.

**"public final String getIdProduct() { ... }"** Ini adalah metode getter (getIdProduct()) yang digunakan untuk mengambil nilai variabel idProduct.

**"public final String getNameProduct() { ... }"** Ini adalah metode getter (getNameProduct()) yang digunakan untuk mengambil nilai variabel nameProduct.

**"public final int getPriceProduct() { ... }"** Ini adalah metode getter (getPriceProduct()) yang digunakan untuk mengambil nilai variabel priceProduct.

**"public final void setNameProduct(String nameProduct) { ... }"** Ini adalah metode setter (setNameProduct()) yang digunakan untuk mengatur nilai variabel nameProduct dengan nilai yang baru.

**"public final void setPriceProduct(int priceProduct) { ... }"** Ini adalah metode setter (setPriceProduct()) yang digunakan untuk mengatur nilai variabel priceProduct dengan nilai yang baru.

**"abstract public void printProduct();"** Ini adalah deklarasi metode abstrak (printProduct()) yang harus diimplementasikan oleh setiap subkelas SeblakProduct. Metode ini bertanggung jawab untuk mencetak detail produk ke layar. Karena ini adalah metode abstrak, itu berarti setiap subkelas SeblakProduct harus memberikan implementasi konkret untuk metode ini.

Selanjutnya adalah **Penjelasan Output**

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/0d254c5b-9227-4fe6-8254-55e9d9da8e85)

Diatas adalah tampilan awal hasil program, program akan menampilkan menu. Dimana terdapat menu menambah, menghapus, melihat (print), dan update. 

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/d67e5647-69ee-449f-bdc0-e1e52f3523dd)

Diatas adalah tampilan jika kita memilih menu 1, yaitu menambahkan menu Spicy Seblak. Maka user akan diminta untuk memasukkan ID, Nama, Harga, dan Tingkat Kepedasan. Setelah selesai, program akan otomatis kembali ke menu awal.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/a56cc60c-cf73-49ff-9fdf-82b6b35ed842)

Sama halnya dengan seblak pedas, jika kita memilih menu 2 maka user dapat menambahkan menu Cheese Seblak. User akan kembali diminta memasukkan ID, Nama, Harga, dan Jenis Keju.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/334fcf91-a3e5-437e-97d8-5777412675b8)

Pada menu 3, kita dapat menghapus menu di menu Spicy Seblak. User akan diminta memasukkan ID Menu yang ingin dihapus dan sesuai dengan menu yang tersedia. Jika berhasil, maka akan muncul output ""**"Spicy Seblak with ID 01 has been removed!"**

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/131dc8e9-250d-4cc4-910e-a8de22418499)

Sama halnya dengan menu 3, kita juga dapat menghapus menu di menu Cheese Seblak.

![image](https://github.com/arstyav/pbo-post-test-2/assets/127498258/012a5f64-9a7d-4cdb-bb7e-5b3109c5400b)

Pada menu 5, kita dapat menampilkan semua menu yang telah ditambahkan.








































