/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiclerentalapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class VehicleRentalApp {
    static ArrayList<Vehicle> vehicle = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        
        // Sample vehicle
        vehicles.add(new Vehicle(1, "Toyota Vios", "Sedan", 1500));
        vehicles.add(new Vehicle(2, "Honda City", "Sedan", 1700));
        vehicles.add(new Vehicle(2, "Toyota Inova", "MPV", 2500));
        vehicles.add(new Vehicle(2, "Mitsubishi Xpander", "MPV", 2200));
        
        int choice;
        
        do {
            System.out.println("\n===== VEHICLE RENTAL SYSYTEM ====");
            System.out.println("1. View Vehicle");
            System.out.println("2. Rent Vehicle");
            System.out.println("3. Return Vehicle");
            System.out.println("4. Exit");
            System.out.println("Enter choice: ");
            
            choice = scanner.nextInt();
            
            switch (choice){
                case 1;
                    viewVehicles();
                    break;
                case 2;
                    rentVehicle();
                    break;
                case 3;
                    returnVehicle();
                    break;
                case 4;
                    System.out.println("Thank you for using the Vehicle Rental System");
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
                    
                }
        }   }while (choice !=);
            
            scanner.close();
}
    

    private static void rentVehicle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void returnVehicle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void viewVehicles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      