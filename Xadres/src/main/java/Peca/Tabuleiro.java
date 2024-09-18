package Peca;
 
/**
*
* @author Admin
*/
public class Tabuleiro {
    public static void main(String[] args) {
        Peca rei = new Rei();
        Peca rainha = new Rainha();
        Peca torre = new Torre();
        Peca cavalo = new Cavalo();
 
        rei.mover();
        rainha.mover();
        torre.mover();
        cavalo.mover();
        
    }
}