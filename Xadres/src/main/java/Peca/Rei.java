package Peca;
 
/**
*
* @author Admin
*/
class Rei extends Peca {
 
    public Rei() {
        super("Rei");
    }
 
    @Override
    public void mover() {
        System.out.println("O " + nome + " pode se mover para todas as direções porem só uma casa por vez.");
    }
}