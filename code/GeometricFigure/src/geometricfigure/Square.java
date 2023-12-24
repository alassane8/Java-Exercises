/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometricfigure;

/**
 *
 * @author wadea
 */
public class Square extends GeometricFigure {
    
    protected Square(double h, double w, String ft){
        super(h, w, ft);
    }
    @Override
    protected double getArea(){
        return height * width;
    }
    protected double getWidth(){
        return width;
    }
    protected double getHeigth(){
        return height;
    }
}
