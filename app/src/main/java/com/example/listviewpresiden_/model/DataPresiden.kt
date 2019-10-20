package com.example.listviewpresiden_.model

import com.example.listviewpresiden_.R

object DataPresiden {
    private val namapresidenri = arrayOf(
        "Ir. Soekarno",
        "Soeharto",
        "BJ. Habibie",
        "Abdurrahman Wahid",
        "Megawati",
        "Susilo Bambang Yudhoyono",
        "Ir. Joko Widodo"
    )

    private val datapresiden = arrayOf(
        "Ir. Soekarno adalah presiden pertama RI, yang menjabat pada 18 Agustus 1945 – 12 Maret 1967",
        "Soeharto adalah presiden kedua RI yang menjabat pada 12 Maret 1967 – 21 Mei 1998",
        "BJ. Habibie adalah presiden ketiga RI yang menggantikan Soeharto & menjabat pada 21 Mei 1998 – 20 Oktober 1999",
        "Abdurrahman Wahid atau biasa dikenal dengan Gusdur adalah presiden keempat RI, yang menjabat pada 20 Oktober 1999 – 23 Juli 2001",
        "Megawati adalah presiden kelima RI, yang menjabat pada 23 Juli 2001 – 20 Oktober 2004",
        "Susilo Bambang Yudhoyono adalah presiden keenam RI, yang menjabat pada 20 Oktober 2004 – 20 Oktober 2014",
        "Joko Widodo atau biasa dikenal Jokowi adalah presiden ketujuh RI, 20 Oktober 2014 – Sekarang"
    )

    private val presidenPoster = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listPresiden: ArrayList<Presiden>
    get() {
        val list = arrayListOf<Presiden>()
        for (position in namapresidenri.indices){
            val presiden = Presiden()
            presiden.name = namapresidenri[position]
            presiden.data = datapresiden[position]
            presiden.poster = presidenPoster[position]
            list.add(presiden)
        }
        return list
    }
}