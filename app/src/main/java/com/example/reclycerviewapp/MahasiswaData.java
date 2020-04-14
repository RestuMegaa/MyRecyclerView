package com.example.reclycerviewapp;

import java.util.ArrayList;

public class MahasiswaData {
    private static String[] mahasiswaNama = {
            "Mega Restu Mirantika",
            "Verdyawan Eka Prayoga",
            "Yulianti",

    };

    private static String[] mahasiswaNim = {
            "311710112",
            "311710496",
            "311710291",

    };

    private static String[] mahasiswaHp = {
            "0896-8857-1302",
            "0857-8789-8793",
            "0896-8906-8754",

    };

    private static int[] mahasiswaImage = {
            R.drawable.mega,
            R.drawable.yoga,
            R.drawable.lia,

    };

    static ArrayList<Mahasiswa> getListData() {
        ArrayList<Mahasiswa> list = new ArrayList<>();
        for (int position =0; position < mahasiswaNama.length; position++) {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNama(mahasiswaNama[position]);
            mahasiswa.setNim(mahasiswaNim[position]);
            mahasiswa.setPhoto(mahasiswaImage[position]);
            mahasiswa.setNoHp(mahasiswaHp[position]);
            list.add(mahasiswa);
        }
        return list;
    }
}