public class Escudo {
    public String nome;
    public double defesa;

    public Escudo(String nome, double defesa){
        this.nome = nome;
        this.defesa = defesa; // percentual entre 0.0 e 0.99
    }
    public String getNome(){
        return nome;
    }
    public double getDefesa(){
        return defesa;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDefesa(double defesa){
        this.defesa = defesa;
    }
    public boolean defende(){
        // se defesa for 0.25
        return Math.random() <= defesa;
    }
}

