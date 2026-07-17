/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.coffeeshop.naive;

/**
 *
 * @author eliez
 */
// Highly cohesive interface solely responsible for declaring how order data is saved.
public interface OrderRepository {
    void saveOrder(String customerName, String coffeeType, double totalAmount);
}
