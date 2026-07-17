/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.coffeeshop.naive;

/**
 *
 * @author eliez
 */
// Highly cohesive interface solely responsible for declaring how receipts are printed.
public interface ReceiptPrinter {
   void printReceipt(String customerName, String coffeeType, double price, double tax, double finalPrice); 
}
