package Exercice1;


/*
*@author Konate-MK
*/

public class Rectangle extends Shape{

    public Rectangle(int largeur, int hauteur) {
        super(largeur, hauteur);
    }

    @Override
    public int getArea(){
        return this.largeur * this.hauteur;
    }
}
