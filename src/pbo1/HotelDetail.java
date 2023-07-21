package pbo1;//inheritance
public class HotelDetail extends Hotel{
     //overriding
    public HotelDetail(String nokamar, String namakamar) {
        super(nokamar, namakamar);
    }
    
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
        }
    }
    
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
   //polymortisme(override)
    @Override
    public String displayInfo(){
            return super.displayInfo()+
            "\nNamaKamar = "+getLamaMenginap()+
            "\nTipe = "+getTipe();
        }
    }