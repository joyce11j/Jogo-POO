public class Jogo {
    public static void main(String[] args){
        Personagem p1 = new Personagem("Joyce");
        Personagem p2 = new Personagem("Lívia");

        Arma a1 = new Arma("Faca", 2);
        Arma a2 = new Arma("Facão", 5);

        Escudo e1 = new Escudo("Escudo", 0.35);

        p1.setArma(a1);
        p1.setEscudo(e1);
        p2.setArma(a2);
        p2.setEscudo(e1);

        p2.sofrerDano(p1);
        p2.sofrerDano(p1);
        p1.sofrerDano(p2);
    }
}

