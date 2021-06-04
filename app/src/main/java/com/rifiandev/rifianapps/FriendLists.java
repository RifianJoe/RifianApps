package com.rifiandev.rifianapps;

import java.util.ArrayList;

public class FriendLists {

    private static String [] data_nama={
            "Azis Komara",
            "Dhimas Aji Ghairrahmat",
            "Ikrar Anugrah Bastary",
            "Fiqri Akbar Pratama",
            "Zaenal Anzarry"
    };

    private static String [] data_alamat={
            "Subang",
            "Bandung",
            "Cibiru",
            "Rancaekek",
            "Gadobangkong"
    };

    private static int [] data_img={
            R.drawable.azira,
            R.drawable.ejen,
            R.drawable.imrar,
            R.drawable.piqri,
            R.drawable.zaenal
    };

    private  static  String [] Data_kegiatan = {
            "Nugas",
            "Sholat",
            "Nugas",
            "Jalan-Jalan",
            "Tidur"
    };

    private static String [] Data_musik = {
            "Dari Sabang Sampai Merauke",
            "Satu Nusa Satu Bangsa",
            "Indonesia Raya",
            "Rasa Sayange"
    };

    static ArrayList<Friendly> getListData(){
        ArrayList<Friendly> FriendList = new ArrayList<>();
        for (int position = 0; position < data_nama.length; position++){
            Friendly fl = new Friendly();
            fl.setNama(data_nama[position]);
            fl.setAlamat(data_alamat[position]);
            fl.setfoto(data_img[position]);

            FriendList.add(fl);
        }
        return FriendList;
    }

    static  ArrayList<Friendly> getListkegiatan(){
        ArrayList<Friendly> dailyList= new ArrayList<>();
        for (int position = 0; position < Data_kegiatan.length; position++){
            Friendly friend = new Friendly();
            friend.setKegiatan(Data_kegiatan[position]);

            dailyList.add(friend);
        }
        return  dailyList;
    }

    static ArrayList<Friendly> getListMusic(){
        ArrayList<Friendly> musicList = new ArrayList<>();
        for(int position = 0; position < Data_musik.length; position++){
            Friendly music = new Friendly();
            music.setMusic(Data_musik[position]);
            musicList.add(music);
        }
        return  musicList;
    }





}
