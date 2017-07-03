/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Argoncillo_070317;


public class AbstractDemo {
    public static void main(String []args){
    FlyingSuperHero fsh = new FlyingSuperHero();
    Spiderman wew = new Spiderman();
    //fsh.displayPower();
   // wew.displayPower();
    fsh.setSuperPowers("New Power", 2);
   fsh.printSuperPowers();
  
    }
}
