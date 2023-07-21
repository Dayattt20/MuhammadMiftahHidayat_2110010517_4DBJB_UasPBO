package pbo1;
import java.util.Scanner;
public class HotelBeraksi {
    public static void main(String[] args) {
        //objek
        //DataPemesanHotel hotel = new DataPemesanHotel("2110010517","Dayat");
        
        //System.out.println(hotel.displayInfo());
        //System.out.println(hotel.displayInfo("Barabai"));
        
        //error headling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
       HotelDetail[] hotel= new HotelDetail[2];
        
        //perulangan
        for(int i =0; i<hotel.length;i++){  
        System.out.print(" Masukkan NoKamar "+(i+1)+" = ");
        String nokamar = scanner.nextLine();
        System.out.print(" Masukkan NamaPemesan "+(i+1)+" = ");
        String namapemesan = scanner.nextLine();
        
        //objek
        hotel[i] = new HotelDetail(nokamar,namapemesan);
        }
        //perulangan
        for(HotelDetail data : hotel) {
            System.out.println("====================");
            System.out.println("Data Pemesan Hotel= ");
            System.out.println(data.displayInfo());
        }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format NAMAKAMAR "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NOKAMAR"+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Input"+e.getMessage());
    }
  }    
}