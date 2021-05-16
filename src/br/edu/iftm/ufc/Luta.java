package br.edu.iftm.ufc;

import java.util.Random;

public class Luta {

    private Lutador desafiado;// null
    private Lutador desafiante;// null
    private boolean aprovada;// false

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria() == desafiante.getCategoria()) {
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void luta() {
        if (this.aprovada) {
            System.out.println("Itss Timmmmeeeeee!!!!");
            System.out.println("Do lado direto do ringue temos o lutador:");
            this.desafiado.apresentar();
            System.out.println("Do lado esquerdo do ringue temos o lutador:");
            this.desafiante.apresentar();
            System.out.println("Que a Luta começe");
            this.sorteiaGanhador();
        } else {
            System.out.println("A Luta não foi autorizada");
        }

    }

    private void sorteiaGanhador() {
        Random aletorio = new Random();
        int numeroGanhador = aletorio.nextInt(3);
        if (numeroGanhador == 0) {
            this.desafiado.empatarLuta();
            this.desafiante.empatarLuta();
        } else if (numeroGanhador == 1) {
            this.desafiado.ganharLuta();
            ;
            this.desafiante.perderLuta();
            ;
        } else if (numeroGanhador == 2) {
            this.desafiado.perderLuta();
            this.desafiante.ganharLuta();
        }
    }

}
