/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 * The Rectangle class, subclass of Shape
 * @author Windows
 */
public class Rectangle extends Shape{
    //Private member variables
    private int length;
    private int width;
    //constructor
    public Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public String toString(){
        return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
    }
    //override the inherited getArea() to provide the proper implementation
    @Override
    public double getArea(){
        return length*width;
    }
    
    
}
