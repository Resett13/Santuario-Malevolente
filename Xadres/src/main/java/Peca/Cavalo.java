package Peca;
 
/**
*
* @author Admin
*/
class Cavalo extends Peca {
 
    public Cavalo() {
        super("Cavalo");
    }
 
    @Override
    public void mover() {
        System.out.println("O " + nome + " faz o L.");
    }
}