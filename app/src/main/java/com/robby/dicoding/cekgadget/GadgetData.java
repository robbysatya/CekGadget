package com.robby.dicoding.cekgadget;

import java.util.ArrayList;

public class GadgetData {
    private static String[] gadgetName = {
            "Oppo Reno 3",
            "Oppo Reno 2",
            "Oppo A5S",
            "Samsung S10",
            "Samsung Note 10",
            "Samsung A50",
            "IPhone X",
            "IPhone XR",
            "IPhone 11 Pro Max",
            "Asus ROG Phone 2",
            "Xiaomi Black Shark"

    };

    private static String[] gadgetDetail = {
            "Dari sektor dapur pacu, Oppo Reno 3 disematkan chipset MediaTek Helio P90, yang dilengkapi dengan dukungan RAM 8GB dan penyimpanan internal sebesar 128GB, yang juga dapat ditingkatkan kapasitasnya hingga 256GB dengan kartu memori.",
            "Oppo Reno 2 mengusung model pop-up mirip sirip ikan hiu yang disebut Pivot Rising Camera, serupa dengan Reno 10x Zoom. Sementara, Oppo Reno 2F sendiri mengadopsi teknologi Rising Camera serupa dengan Oppo F11 Pro.",
            "OPPO A5S 3GB hadir dengan sudut pandang yang lebih luas dengan layar tetesan air (waterdrop). Hal ini menghasilkan rasio body ke layar  sebesar 89.35%. Layar memiliki besaran 6,2 inci yang diperkuat dengan kaca Corning Gorilla Glass untuk memberikan perlindungan dari goresan.",
            "Berbeda dengan pendahulunya, Galaxy S10 hadir dalam tiga model, yaitu Galaxy S10 reguler, S10+, dan S10e. Perbedaan yang mencolok dari ketiganya terletak pada jumlah kamera, desain kamera depan, dan ukuran layar.",
            "Berbeda dengan pendahulunya, Galaxy S10 hadir dalam tiga model, yaitu Galaxy S10 reguler, S10+, dan S10e. Perbedaan yang mencolok dari ketiganya terletak pada jumlah kamera, desain kamera depan, dan ukuran layar.",
            "Berbeda dengan pendahulunya, Galaxy S10 hadir dalam tiga model, yaitu Galaxy S10 reguler, S10+, dan S10e. Perbedaan yang mencolok dari ketiganya terletak pada jumlah kamera, desain kamera depan, dan ukuran layar.",
            "iPhone X merupakan lini yang benar-benar spesial dan beda dari sebelumnya, menandai satu dekade kiprah sang raksasa di industri smartphone. CEO Apple, Tim Cook, mengatakan iPhone X sebagai “lompatan terbesar” dalam sejarah iPhone.",
            "iPhone X merupakan lini yang benar-benar spesial dan beda dari sebelumnya, menandai satu dekade kiprah sang raksasa di industri smartphone. CEO Apple, Tim Cook, mengatakan iPhone X sebagai “lompatan terbesar” dalam sejarah iPhone.",
            "iPhone X merupakan lini yang benar-benar spesial dan beda dari sebelumnya, menandai satu dekade kiprah sang raksasa di industri smartphone. CEO Apple, Tim Cook, mengatakan iPhone X sebagai “lompatan terbesar” dalam sejarah iPhone.",
            "Ponsel ini memiliki dua pilihan dari segi RAM serta memori internal yang masing-masing terdiri dari RAM 8 GB penyimpanan 128 GB dan RAM 12 GB penyimpanan 512 GB.",
            "Handset 5G ini diperkuat Snapdragon 865, dukungan WiFi 6, RAM 8GB atau 12GB, dan storage 256GB. Ponsel ini dilengkapi dengan kamera utama 64MP dengan aperture f/1.8, sementara unit ultra wide-angle 13MP dan kamera ketiga merupakan sensor dengan kedalaman 5MP."


    };

    private static int[] gadgetImg = {
        R.drawable.oppo_reno3,
        R.drawable.oppo_reno2,
        R.drawable.oppo_a5s,
        R.drawable.samsung_s10,
        R.drawable.samsung_note10,
        R.drawable.samsung_a50,
        R.drawable.iphone_x,
        R.drawable.iphone_xr,
        R.drawable.iphone_xmax,
        R.drawable.asus_rog,
        R.drawable.xiaomi_black_shark
    };

    static ArrayList<Gadget> getListData(){
        ArrayList<Gadget> list = new ArrayList<>();
        for (int letak = 0; letak < gadgetName.length; letak++){
            Gadget gadget = new Gadget();

            gadget.setName(gadgetName[letak]);
            gadget.setDetail(gadgetDetail[letak]);
            gadget.setImg(gadgetImg[letak]);
            list.add(gadget);
        }
        return list;
    }
}
