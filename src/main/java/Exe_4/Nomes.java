package Exe_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nomes {
    public static void main(String[] args) {
        List<String> ListaDeNomes = new ArrayList<>();

        ListaDeNomes.add("pedrin");
        ListaDeNomes.add("robin");
        ListaDeNomes.add("zaza");
        ListaDeNomes.add("nobre");
        ListaDeNomes.add("augusto");
        ListaDeNomes.add("marcelo");
        ListaDeNomes.add("priscila");
        ListaDeNomes.add("emersom");
        ListaDeNomes.add("erick");
        ListaDeNomes.add("lara");
        ListaDeNomes.add("katia");
        ListaDeNomes.add("evertom");
        ListaDeNomes.add("daniel");
        ListaDeNomes.add("ana");
        ListaDeNomes.add("matheus");
        ListaDeNomes.add("sebastião");
        ListaDeNomes.add("tereza");
        ListaDeNomes.add("marcileia");
        ListaDeNomes.add("nana");
        ListaDeNomes.add("rodrigo");
        ListaDeNomes.add("nara");
        ListaDeNomes.add("bia");
        ListaDeNomes.add("fabiano");
        ListaDeNomes.add("lucas");
        ListaDeNomes.add("evelen");
        ListaDeNomes.add("ulisses");
        ListaDeNomes.add("pedro");
        ListaDeNomes.add("douglas");
        ListaDeNomes.add("gilvan");
        ListaDeNomes.add("tainara");
        ListaDeNomes.add("luiza");
        ListaDeNomes.add("marcela");
        ListaDeNomes.add("vitoria");
        ListaDeNomes.add("geovanne");
        ListaDeNomes.add("victor");
        ListaDeNomes.add("valnei");
        ListaDeNomes.add("jose");
        ListaDeNomes.add("ithalo");
        ListaDeNomes.add("lorenzo");
        ListaDeNomes.add("edson");
        ListaDeNomes.add("caio");
        ListaDeNomes.add("castro");
        ListaDeNomes.add("dan");
        ListaDeNomes.add("julia");
        ListaDeNomes.add("brenda");
        ListaDeNomes.add("giulia");
        ListaDeNomes.add("paolla");
        ListaDeNomes.add("isabella");
        ListaDeNomes.add("livia");
        ListaDeNomes.add("willian");

       Collections.sort(ListaDeNomes);
       ListaDeNomes.forEach(p -> {
           System.out.println(p);
       });

    }

}
