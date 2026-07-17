/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeeshop.naive;

/**
 *
 * @author eliez
 */
// Implements presentation responsibility independently.
public class ConsoleReceiptPrinter implements ReceiptPrinter {
    @Override
    public void printReceipt(String customerName, String coffeeType, double price, double tax, double finalPrice) {
        System.out.println("\n===== COFFEE SHOP RECEIPT =====");
        System.out.println("Customer: " + customerName);
        System.out.println("Beverage: " + coffeeType);
        System.out.println("Price: PHP " + price);
        System.out.println("Tax (12%): PHP " + tax);
        System.out.println("Total Amount (incl. Tax): PHP " + finalPrice);
        System.out.println("================================\n");
    }
}