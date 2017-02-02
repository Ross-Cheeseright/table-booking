/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablebooking;

/**
 *
 * @author 2cheer65
 */
public class Staff {
    // Attributes // 
    private String name;
    private boolean onShift;
    
    public Staff (String nameIn, boolean onShiftIn)
    {
        name = nameIn;
        onShift = onShiftIn;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public boolean getOnShift()
    {
        return onShift;
    }
}
