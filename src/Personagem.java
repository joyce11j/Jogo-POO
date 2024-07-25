public class Personagem {
    public String nome;
    private int vida;
    private Arma arma;
    private Escudo escudo;

    public Personagem(String nome){
        this.nome = nome;
        vida = 100;
    }
    public String getNome(){
        return nome;
    }
    public int getVida(){
        return vida;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void  setVida(int vida){
        this.vida = Math.min(vida, 100);
    }
    public Arma getArma(){
        return arma;
    }
    public Escudo getEscudo(){
        return escudo;
    }
    public void setEscudo(Escudo escudo){
        this.escudo = escudo;
    }
    public void setArma(Arma arma){
        this.arma = arma;
    }

    public void sofrerDano(Personagem p){
        int dano = p.getArma().dano;
        System.out.printf("%s atacou %s com %s%n", this.nome, p.nome, this.arma.nome);
        p.vida -= arma.dano;

        System.out.printf("%s sofreu dano de %d (Vida: %d)%n%n", p.nome, this.arma.dano, p.vida);
    }
}

