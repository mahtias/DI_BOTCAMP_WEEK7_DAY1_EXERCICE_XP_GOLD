package Exercice1;



public class Rectangle extends Shape{

    public Rectangle(int largeur, int hauteur) {
        super(largeur, hauteur);
    }

    @Override
    public int getArea(){
        return this.largeur * this.hauteur;
    }
}
