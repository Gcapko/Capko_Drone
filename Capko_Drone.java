/*Author Name: Grayson Capko
 * Date: 5/14/2021
 * Project Name: Capko_Drone
 * Purpose: Simulation using button, drone movement in x,y,z location
 */
package Drone_Pack;

import java.util.Scanner;

public class Capko_Drone {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//Creates a drone object which can be move. I used 0, 0, 0 as the starting coordinates
	Drone drone = new Drone(0, 0, 0);
	
	System.out.println("Thank you for using my Drone navagation System!"
			+ "\n The X-axis move the drone forward and Backwards."
			+ "\n The Y-axis turns the drone left and right."
			+ "\n The Z-axis move the drone up and down. Enjoy!");
	
	
	int choice = 0;
	//Shows menu and takes users input to direct the drone. As long as user does not 
	//input 8 the menu will continue to redisplay and take user input. 
	while (choice != 8) {
		showMenu(); 
		choice = input.nextInt();
		switch (choice) {
		case 1 : 
			drone.moveUp();
			System.out.println("-------------------------------------------\n");
			break;
		case 2: 
			drone.moveDown();
			System.out.println("-------------------------------------------\n");
			break;
		case 3:
			drone.moveForward();
			System.out.println("-------------------------------------------\n");
			break;
		case 4:
			drone.moveBackward();
			System.out.println("-------------------------------------------\n");
			break;
		case 5: 
			drone.moveLeft();
			System.out.println("-------------------------------------------\n");
			break;
		case 6: 
			drone.moveright();
			System.out.println("-------------------------------------------\n");
			break;
		case 7: 
			System.out.println(drone);
			break;
			
		}
	}
	//closes Scanner and displays a Farewell message. 
	input.close();
	System.out.print("Thank you using my Drone Navigation System");
	}
	public static void showMenu() {
		//Displays a menu that which is reused by the while loop
		System.out.println("Which direction would you like to move the drone?");
		System.out.println("1 - Move Up");
		System.out.println("2 - Move Down");
		System.out.println("3 - Move Forwards");
		System.out.println("4 - Move Backwards");
		System.out.println("5 - Turn Left");
		System.out.println("6 - Turn Right");
		System.out.println("7 - Display Position");
		System.out.println("8 Exit Navigation");
		
	}
}
class Drone{
	
	int x_cord; // forwards and backwards
	int y_cord;	// left and right
	int z_cord;	// up and down
	public Drone(int x_cord, int y_cord, int z_cord) {
		super();
		this.x_cord = x_cord;
		this.y_cord = y_cord;
		this.z_cord = z_cord;
	}
	public void setX_cord(int x_cord) {	//Sets x coordinates
		this.x_cord = x_cord;
	}
	public void setY_cord(int y_cord) { // Set y coordinates
		this.y_cord = y_cord;
	}
	public void setZ_cord(int z_cord) { // Sets z coordinates
		this.z_cord = z_cord;
	}
	public void moveUp () { // Takes z coordinates and adds 1
		z_cord += 1;
		System.out.println("The Drone has moved up");
	}
	public void moveDown () { // Takes z coordinates and minus 1 as long as the z coordinate is larger than 0
		if (z_cord > 0) {
				z_cord -= 1;
				System.out.println("The Drone has moved Down");
		}
		else 
			System.out.println("You cannot move further down with the Drone.");
	}
	public void moveright () { // Takes y coordinates and adds 1
		y_cord += 1;
		System.out.println("The Drone has turned Right");
	}
	public void moveLeft () { // Takes y coordinates and minus 1
		y_cord -= 1;
		System.out.println("The Drone has turned Left");
	}
	public void moveForward () { // Takes x coordinates and adds 1
		x_cord += 1;
		System.out.println("The Drone has moved Forward");
	}
	public void moveBackward () { // Takes x coordinates and minus 1
		x_cord -= 1;
		System.out.println("The Drone has moved Backwards");
	}
	@Override
	public String toString() {
		return "Drone [x_cord=" + x_cord + ", y_cord=" + y_cord + ", z_cord=" + z_cord + "]";
	}
}