/* 
    Lecture note example - Classes
*/
package pkg;

public class Potato{
    String color;
    boolean isEdible;
    String type;
    double mass;
    
    public Potato(){
        color = "Brown";
        isEdible = true;
        type = "French Fry";
        mass = 170.5;
        
    }
    public Potato(String c, String t, double m){
        color = c;
        isEdible = false;
        type = t;
        mass = m;
        
    }
    public boolean getEdibility(){
        return isEdible;
    }
    
    
}