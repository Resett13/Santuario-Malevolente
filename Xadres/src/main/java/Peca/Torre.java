package Peca;
 
/**
*
* @author Admin
*/
class Torre extends Peca {
 
    public Torre() {
        super("Torre");
    }
 
    @Override
    public void mover() {
        System.out.println("A " + nome + " pode se mover quantas casas quiser tanto na horizontal quanto na vertical");
    }
}