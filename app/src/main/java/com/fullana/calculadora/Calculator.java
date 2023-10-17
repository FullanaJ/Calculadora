package com.fullana.calculadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    public static int suma(String operacion){

        int[] suma = {0};
        List<String> lista;
        if(operacion.contains("*"))
            iteraSumador(suma,Calculator.multiplica(operacion));
        else
            iteraSumador(suma, Arrays.asList(operacion.split("(?=-)|(\\+)")));

        return suma[0];
    }

    private static void iteraSumador(int[] suma, List<String> lista) {
        lista.forEach((v) -> suma[0] += (Integer.parseInt(v)));
    }

    private static List<String>multiplica(String s) {

        List<String> lista = Arrays.asList(s.split("(?=\\*-)|(\\+)|(?=-)|(?=\\*)"));
        ArrayList<String> l = new ArrayList<>();
        for(int i = 0,size= lista.size();i<size;i++){
            if(lista.get(i).contains("*")) {
                l.add(String.valueOf(Math.multiplyExact(Integer.parseInt(l.get(l.size() - 1)), Integer.parseInt(lista.get(i).substring(1)))));
                l.remove(l.size()-2);
            }else
                l.add(lista.get(i));
        }
        return l;
    }

    private static String listToString(ArrayList<String> l) {
        String p = "";
        for (String str: l) {
            p += str;
        }
        return p;
    }
}
