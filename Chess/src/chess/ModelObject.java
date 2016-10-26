/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.awt.Point;

/**
 *
 * @author Dro0076
 */
public abstract class ModelObject {
    
    private Point position;

    public ModelObject(Point position) {
        this.position = new Point(position.x,position.y);
    }

    public int getX() {
        return position.x;
    }

    public int getY() {
        return position.y;
    }

    public Point getPosition() {
        return this.position;
    }
   
    protected void move(int offsetX, int offsetY) {
        position = new Point(getX() + offsetX, getY() + offsetY);
    }

    public abstract void process();
}
