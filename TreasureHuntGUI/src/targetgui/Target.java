/**
*Tazaki Khan
* Target.java
* All rights reserved
* CS325
*/

package targetgui;

public class Target {
    
    public static int ROWS = 9;
    public static int COLUMNS = 9;
    
    private String name;
    private int xLocation;
    private int yLocation;
   
    
    
    public Target() {
       
    }
    
    public Target(String newName) {
        
    }
    
    public int getXLocation() {
        return xLocation;
    }
    
    public int getYLocation() {
        return yLocation;
    }
    
}