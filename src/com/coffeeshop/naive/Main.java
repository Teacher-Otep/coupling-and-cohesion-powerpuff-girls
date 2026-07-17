/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeeshop.naive;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Starting  Coffee Shop System ===");

        // Step 1: Instantiate the independent structural units
        ReceiptPrinter printer = new ConsoleReceiptPrinter();
        OrderRepository repository = new FileOrderRepository("orders_log.txt");

        // Step 2: Inject dependencies into the coordinator class
        OrderProcessor processor = new OrderProcessor(printer, repository);

        // Step 3: Run the structured workflow execution
        processor.processOrder("Ellie", "Matcha latte", 450.0);

        System.out.println("\n=== Order Processing Complete ===");
    }
}