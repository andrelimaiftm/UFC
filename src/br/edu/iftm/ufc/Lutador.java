package br.edu.iftm.ufc;

public class Lutador {
    //atributos da classe
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;//0.0
    private String categoria;//null
    private int vitorias;//0
    private int derrotas;//0
    private int empates;//0

    //metodos das classe
    public Lutador(String nome, String nacionalidade, int idade, float peso, float altura) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.definirCategoria();
    }

    private void definirCategoria(){
        if(this.peso < 52.3f){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public void apresentar(){
        System.out.println("Lutador: " + this.nome);
        System.out.println("Origem: " + this.nacionalidade);
        System.out.println("Categoria: " + this.categoria);
        System.out.format("O lutador tem %d anos, %.2fm de altura e peso %.1fkg.\n", this.idade, this.altura, this.peso);
        System.out.format("Vitórias: %d\tDerrotas: %d\tEmpates: %d\n",this.vitorias, this.derrotas, this.empates);
    }

    public void ganharLuta(){        
        this.vitorias++;
        System.out.format("O Lutador %s foi o ganhador\n", this.nome);
    }

    public void perderLuta(){
        this.derrotas++;
        System.out.format("O Lutador %s foi o perdedor\n", this.nome);
    }

    public void empatarLuta(){
        this.empates++;
        System.out.format("O Lutador %s empatou\n", this.nome);
    }

    public void getStatus(){
        System.out.format("O lutador %s tem: Vitórias: %d\tDerrotas: %d\tEmpates: %d\n",this.nome, this.vitorias, this.derrotas, this.empates);
    }
    //metodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.definirCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }    

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }   
    
}
