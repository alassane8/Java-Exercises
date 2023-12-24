/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometricfigure;

/**
 *
 * @author wadea
 */
public class Triangle extends GeometricFigure {
    
    protected Triangle(double h, double w, String ft){
        super(h, w, ft);
    }
    @Override
    protected double getArea(){
        return (height * width) / 2;
    }
    protected double getWidth(){
        return width;
    }
    protected double getHeigth(){
        return height;
    }
}
