/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
class Vehicle {
    int id;
    String name;
    String type;
    double pricePerDay;
    boolean available;
    
    Vehicle(int id, String name, String type, double pricePerDay){
        this.id = id;
        this.name = name;
        this.type = type;
        this.pricePerDay = pricePerDay;
    }

    Vehicle(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    void display(){
        System.out.println();
        id + " | " + name + " | " + type + " | " + pricePerDay + "/day | " + (available ? "Available" : "Rented")
                
                );
    }
    
    
}
