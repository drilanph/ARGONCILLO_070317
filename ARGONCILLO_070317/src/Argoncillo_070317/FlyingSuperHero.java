/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Argoncillo_070317;

/**
 *This method will display power
 * @param 
 * This method does not have parameter
 * @return
 * This method does not return any value
 */
 class FlyingSuperHero extends SuperHero{
    @Override
    void displayPower(){
        System.out.println("Fly...");
    }                
    void setSP(String [] superPowers){
    super.setSuperPowers(superPowers);
    }
    
    
}
