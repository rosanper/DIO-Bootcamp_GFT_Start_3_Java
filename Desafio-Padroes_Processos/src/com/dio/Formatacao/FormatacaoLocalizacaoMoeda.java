package com.dio.Formatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatacaoLocalizacaoMoeda {
    public static NumberFormat determinar(){
        Locale localeBr = new Locale("pt","BR");
        return NumberFormat.getCurrencyInstance(localeBr);
    }
}
