package com.DIO.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatacaoLocalizacao {
    public static NumberFormat determinar(){
        Locale localeBr = new Locale("pt","BR");
        return NumberFormat.getCurrencyInstance(localeBr);
    }

}
