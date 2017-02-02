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
public class Table {
    // Attributes // 
    private int tableNumber;
    private int numberOfSeats;
    private boolean tableOutside;
    private Staff allocateStaff;
    private Booking allocateBooking;
    
    // Constructor //
    public Table (int tableNumberIn, int numberOfSeatsIn, 
                  boolean tableOutsideIn)
    {
        tableNumber   = tableNumberIn;
        numberOfSeats = numberOfSeatsIn;
        tableOutside  = tableOutsideIn;
        
        allocateStaff = null;
        allocateBooking = null;
    }
    
    // Methods // 
    public void assignStaffMember(Staff staffIn)
    {
        allocateStaff = staffIn;
    }
    
    public boolean bookTable( Booking bookingIn)
    {
        if (bookingIn.getDineOut() == tableOutside)
        {
            if (bookingIn.getNoGuests()<= numberOfSeats)
            {
                allocateBooking = bookingIn;
                return true;
            }
        }
        else
        {
            if (numberOfSeats >= bookingIn.getNoGuests())
            {
                allocateBooking = bookingIn;
                return true;
            }
        }
        return false;
    }
     
    public String toString ()
    {
        String ret = "Table Number : \t" + tableNumber + "\n " +
                     "Serving Staff: \t" + allocateStaff.getName() +"\n ";
        return ret;
    }
}
