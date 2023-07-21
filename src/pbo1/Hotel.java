
package pbo1;
//class
public class Hotel {
    //atribut dan encapculation
    private String nokamar;
    private String namakamar;

    //construktor
    public Hotel(String nokamar, String namakamar) {
        this.nokamar = nokamar;
        this.namakamar = namakamar;
    }

    //setter
    public void setNokamar(String nokamar) {
        this.nokamar = nokamar;
    }

    public void setNamaKamar(String namakamar) {
        this.namakamar = namakamar;
    }
 
    //getter
    public String getNoKamar() {
        return nokamar;
    }

    public String getNamaKamar() {
        return namakamar;
    }
    
    
    public String displayInfo() {
        return "NOKAMAR = "+getNoKamar()+ "\nNamapemesan = "+getNamaKamar ();
    }
    
    //polymortisme(overloding)
    public String displayInfo(String namapemesan){
        return displayInfo()+"\nNamapemesan = "+namapemesan;
    }
}
