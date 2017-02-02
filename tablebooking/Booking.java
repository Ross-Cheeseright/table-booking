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
public class Booking {
    // Attributes //
    private String name;
    private int noGuests;
    private boolean dineOut;
    
    // Constructor //
    public Booking (String nameIn, int noGuestsIn, boolean dineOutIn)
    {
        name = nameIn;
        noGuests = noGuestsIn;
        dineOut = dineOutIn;
    }
    
    // Getter Methods //
    public String getName()
    {
        return name;
    }
    
    public int getNoGuests()
    {
        return noGuests;
    }
    
    public boolean getDineOut()
    {
        return dineOut;
    }
}
