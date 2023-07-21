# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data hotel menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa no kamar dan nama kamar, dan memberikan output berupa informasi detail dari data pemesanan hotel tersebut seperti no kamar, nama pemesan, nama kamar, dan tipe kamar.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Hotel`, `HotelDetail`, dan `HotelBeraksi` adalah contoh dari class.

```bash
public class Hotel {
    ...
}

public class HotelDetail extends Hotel {
    ...
}

public class HotelBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `hotel[i] = new HotelDetail(nama kamar, no kamar);` adalah contoh pembuatan object.

```bash
hotel[i] = new HotelDetail(nama kamar, no kamar);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama kamar` dan `no kamar` adalah contoh atribut.

```bash
String namakamar;
String nokamar;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Hotel` dan `HotelDetail`.

```bash
public Hotel(String namakamar, String nokamar) {
    this.namakamar = namakamar;
    this.nokamar = nokamar;
}

public HotelDetail(String namakamar, String nokamar) {
    super(namakamar, nokamar);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaKamar` dan `setNoKamar` adalah contoh method mutator.

```bash
public void setNamaKamar(String namakamar) {
    this.namakamar = namakamar;
}

public void setNoKamar(String nokamar) {
    this.nokamar = nokamar;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaKamar`, `getNoKamar` adalah contoh method accessor.

```bash
public String getNamaKamar() {
    return namakamar;
}

public String getNoKamar() {
    return nokamar;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namakamar` dan `nokamar` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namakamar;
private String nokamar;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `HotelDetail` mewarisi `Hotel` dengan sintaks `extends`.

```bash
public class HotelDetail extends Hotel {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Hotel` merupakan overloading method `displayInfo` dan `displayInfo` di `HotelDetail` merupakan override dari method `displayInfo` di `Hotel`.

```bash
   public String displayInfo(String namapemesan){
   return displayInfo()+"\nNamapemesan = "+namapemesan;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getLamaMenginap` dan seleksi `switch` dalam method `getTipe`.

```bash
  public String getLamaMenginap(){
  String namaKamar = getNoKamar().substring(0, 4);
  //seleksi swicth
  switch(namaKamar) {
  case "0011":
  return "Dahlia";
  case "0022":
  return "Mawar";
  case "0033":
  return "Anggrek";
  default:
  return "Kamar lainnya";

  public String getTipe(){
  String tipeKamar = getNoKamar().substring(4,6);
  //seleksi swicth
  switch(tipeKamar) {
  case "01":
  return "Superior Room";
  case "02":
  return "Deluxe Room";
  case "03":
  return "Standard Room";
  case "04":
  return "Single Room";
  default:
  return "Dan Seterusnya";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i =0; i<hotel.length;i++){  
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print(" Masukkan NoKamar "+(i+1)+" = ");
String nokamar = scanner.nextLine();
System.out.print(" Masukkan NamaPemesan "+(i+1)+" = ");
String namapemesan = scanner.nextLine();

for(HotelDetail data : hotel) {
System.out.println("====================");
System.out.println("Data Pemesan Hotel= ");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `HotelDetail[] hotel = new HotelDetail[2];` adalah contoh penggunaan array.

```bash
HotelDetail[] hotel = new HotelDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
catch(NumberFormatException e ) {
System.out.println("Kesalahan Format NAMAKAMAR "+e.getMessage());
}   catch(StringIndexOutOfBoundsException e){
System.out.println("Kesalahan Format NOKAMAR"+e.getMessage());
}
catch (Exception e){
System.out.println("Kesalahan Input"+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Miftah Hidayat
NPM: 2110010517
