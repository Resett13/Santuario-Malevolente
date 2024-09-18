package Peca;
 
/**
*
* @author Admin
*/
abstract class Peca {
    protected String nome;
 
    public Peca(String nome) {
        this.nome = nome;
    }
 
    public abstract void mover();
}