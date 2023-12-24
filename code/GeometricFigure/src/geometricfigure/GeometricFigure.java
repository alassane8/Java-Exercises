/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometricfigure;

/**
 *
 * @author wadea
 */
public abstract class GeometricFigure {
    protected double height;
    protected double width;
    protected String figureType;
    
    protected GeometricFigure(double h, double w, String ft){
        height = h;
        width = w;
        figureType = ft;
    }
    
    protected abstract double getArea();
}
