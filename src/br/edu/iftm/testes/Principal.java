package br.edu.iftm.testes;

import br.edu.iftm.ufc.Luta;
import br.edu.iftm.ufc.Lutador;

public class Principal {
    public static void main(String[] args) {
        Luta luta = new Luta();

        Lutador lutador1 = new Lutador("Goku", "Japão", 40, 90f, 1.80f);
        Lutador lutador2 = new Lutador("Smegol/Gollum", "Terra Média", 100, 30f, 1.00f);
        Lutador lutador3 = new Lutador("Mario", "Ilha Ioshi", 50, 100f, 1.50f);
        Lutador lutador4 = new Lutador("Naruto", "Konoha", 18, 85f, 1.80f);

        luta.marcarLuta(lutador1, lutador2);
        System.out.println(lutador1.getCategoria());         
        System.out.println(lutador2.getCategoria()); 
        luta.luta();
        lutador1.getStatus();
        lutador2.getStatus();


        luta.marcarLuta(lutador1, lutador3);
        luta.luta();
        lutador1.getStatus();
        lutador3.getStatus();

        luta.marcarLuta(lutador1, lutador4);
        luta.luta();
        lutador1.getStatus();
        lutador4.getStatus();
        
    }
}
