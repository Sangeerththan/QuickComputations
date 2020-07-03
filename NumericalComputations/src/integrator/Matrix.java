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
class Matrix {
    private int row;
    private int column;
    private double[][] matrix;
    
    Matrix(int row,int column){
        this.row = row;
        this.column =column;
        this.matrix = new double[row][column];               
    }
    
            
    
}
