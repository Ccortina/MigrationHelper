/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

/**
 *
 * @author admin
 */
public class OleObject {
    
    private int fromStart, fromEnd ;
    private int toStart, toEnd;

    public OleObject() {
    }

    public OleObject(int fromStart, int fromEnd, int toStart, int toEnd) {
        this.fromStart = fromStart;
        this.fromEnd = fromEnd;
        this.toStart = toStart;
        this.toEnd = toEnd;
    }

    public int getFromStart() {
        return fromStart;
    }

    public void setFromStart(int fromStart) {
        this.fromStart = fromStart;
    }

    public int getFromEnd() {
        return fromEnd;
    }

    public void setFromEnd(int fromEnd) {
        this.fromEnd = fromEnd;
    }

    public int getToStart() {
        return toStart;
    }

    public void setToStart(int toStart) {
        this.toStart = toStart;
    }

    public int getToEnd() {
        return toEnd;
    }

    public void setToEnd(int toEnd) {
        this.toEnd = toEnd;
    }
    
    
    
    
}
