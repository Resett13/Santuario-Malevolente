package Peca;
 
/**
*
* @author Admin
*/
class Rainha extends Peca {
 
    public Rainha() {
        super("Rainha");
    }
 
    @Override
    public void mover() {
        System.out.println("A " + nome + " pode se mover para qualquer direção sem restrições ao contrario do rei.");
    }
}