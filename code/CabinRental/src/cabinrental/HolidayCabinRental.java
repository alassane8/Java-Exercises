/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabinrental;

/**
 *
 * @author wadea
 */
public class HolidayCabinRental extends CabinRental {
    private int roomNumber;
    private double totalrent;
    
    public HolidayCabinRental(int number, int wrr, int rnum){
        super(number, wrr);
        roomNumber = rnum;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public double getTotalRent(){
        totalrent = weeklyRentalRate + 150;
        return totalrent;
    }
}
