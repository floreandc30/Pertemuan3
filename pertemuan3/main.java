package pertemuan3;

public class main {
    public static void main(String[] args) { //psvm
        //pembuatan class
        SepedaMotor honda = new SepedaMotor(  "Honda", "Vario 125", 22000000 );
        SepedaMotor yamaha = new SepedaMotor( "Yamaha", "NMax", 40000000 );
        SepedaMotor vespa = new SepedaMotor( "Vespa", "Vespa", 55000000 );

        /*
        //mengisi atribut dari objek honda
        honda.merk = "Honda";
        honda.tipe = "Vario 160";
        honda.harga = 35000000;

        //mengisi atribut dari objek yamaha
        yamaha.merk = "Yamaha";
        yamaha.tipe = "NMax";
        yamaha.harga = 40000000;

        //mengisi atribut dari objek vespa
        vespa.merk = "Vespa";
        vespa.tipe = "Vespa Sprint";
        vespa.harga = 56000000;
        */

        //menjalankan method showInfo
        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();

        //uji coba getter&setter
        System.out.println("uji coba getter&setter");
        System.out.println("Motor dengan merk " + yamaha.getMerk() + " dengan tipe (before) : " + yamaha.getTipe());
        yamaha.setTipe("Yamaha 125");
        System.out.println("Motor merk " + yamaha.getMerk() + " dengan tipe (after) : " + yamaha.getTipe());
    }
}
