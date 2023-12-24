/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cabinrental;

/*
 * @author wadea
 */

public class CabinRental {
    public int cabinNumber;
    public double weeklyRentalRate;
    
    public CabinRental(int number, int wrr){
        cabinNumber = number;
        weeklyRentalRate = wrr;
        
        if (number == 1 || number == 2 || number == 3){
            weeklyRentalRate = 950.0;
        }
        else {
            weeklyRentalRate = 1100.0;
        }
    }
    
    public int getCabinNumber(){
        return cabinNumber;
    }
    public double getWeeklyRentalRate(){
        return weeklyRentalRate;
    }
}
