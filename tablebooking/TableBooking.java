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
public class TableBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creating Table Objects //
        Table t1 = new Table(1, 10, true);
        Table t2 = new Table(2, 8, false);
        
        
        // Creating Bookings //
        Booking b1 = new Booking("James", 10, true);
        Booking b2 = new Booking("Smith", 2, false);
        Booking b3 = new Booking("Dogbert", 8, true);
        Booking b4 = new Booking("Peter", 15, false);
        
        
        // Creating Staf Objects //
        Staff s1 = new Staff("Jim", false);
        Staff s2 = new Staff("Sally", true);
        
        // Allocate Staff to Table //
        t1.assignStaffMember(s1);
        
        // Assign customers to table //
        System.out.println(t1.bookTable(b1));
        System.out.println(t1.bookTable(b2));
        System.out.println(t1.bookTable(b3));
        System.out.println(t1.bookTable(b4));
        
        // Output details //
        System.out.println(t1.toString());
    }
    
}
