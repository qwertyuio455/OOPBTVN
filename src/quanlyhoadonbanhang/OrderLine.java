/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyhoadonbanhang;

/**
 *
 * @author Administrator
 */
public class OrderLine {
    private String name;  
    private int quantity;  
    private double price;  
    private String currency;  

    public OrderLine(String item, int quantity, double price, String currency) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.currency = currency;
    }

    public double getTotal() {
        return quantity * price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
