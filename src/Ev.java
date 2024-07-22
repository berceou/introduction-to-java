public class Ev {
    // class ev demek evin şablonu
    String kapiRengi = "mavi"; // instance field
    // her oluşan evin (instance) değişebilecek bir state - durum oldu
    int camSayisi = 3;

    //? her bir objenin kendine özgü bir değeri var.
    // her obje değeri olmasa dahi farklı memoryde saklanıyor. ev1 ve ev2 farklı katmandalar ev1.kapiRengi ile ev2.kapiRengi methodlar aynı olsa da değerler farklı
    //! stack ortak yerde her oluşturulan obje orta bi yerde duruyor.
}
