/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeeshop.naive;

public class OrderProcessor {
    private static final double TAX_RATE = 0.12;
    
    // Dependencies are abstract interfaces rather than concrete classes (Low Coupling)
    private final ReceiptPrinter receiptPrinter;
    private final OrderRepository orderRepository;

    // Dependency Injection via Constructor
    public OrderProcessor(ReceiptPrinter receiptPrinter, OrderRepository orderRepository) {
        this.receiptPrinter = receiptPrinter;
        this.orderRepository = orderRepository;
    }

    public void processOrder(String customerName, String coffeeType, double price) {
        System.out.println("[System] Calculating final totals...");
        
        // Business Logic Responsibility
        double localTax = price * TAX_RATE;
        double finalPrice = price + localTax;

        // Delegating Presentation Responsibility
        receiptPrinter.printReceipt(customerName, coffeeType, price, localTax, finalPrice);

        // Delegating Persistence Responsibility
        orderRepository.saveOrder(customerName, coffeeType, finalPrice);
    }
}