/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeeshop.naive;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author eliez
 */
// Implements data persistence responsibility independently.
public class FileOrderRepository implements OrderRepository {
    private final String filePath;

    // File path is passed via constructor instead of hardcoding, increasing flexibility
    public FileOrderRepository(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void saveOrder(String customerName, String coffeeType, double totalAmount) {
        System.out.println("[System] Saving transaction logs to disk...");
        
        // Using try-with-resources to cleanly handle exceptions and guarantee closure
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write("Customer: " + customerName + " | Item: " + coffeeType + " | Total: " + totalAmount + "\n");
            System.out.println("[Database] Log successfully written to " + filePath);
        } catch (IOException e) {
            System.err.println("[CRITICAL ERROR] Failed to write to file system: " + e.getMessage());
        }
    }
}
