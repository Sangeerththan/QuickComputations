/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrator;

/**
 *
 * @author Sangeerththan
 */
public class Vector {
    private int dimension;
    private int[] vector;
    
    public Vector(int dimension){
        this.dimension =dimension;
        this.vector = new int[dimension];        
    }
}
