/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyhoadonbanhang;

import java.util.ArrayList;


/**
 *
 * @author Administrator
 */
public class Order {
    private Customer customer;  
    private ArrayList<OrderLine> orderLines = new ArrayList<>();  
    private double total = 0.0;  
    private String currency; 
   
    public Order(Customer customer, String currency) {
        this.customer = customer;
        this.currency = currency;
    }

    public void addLine(OrderLine line) {
        if (line.getCurrency().equals(this.currency)) {  // Kiểm tra đơn vị tiền tệ
            orderLines.add(line);
            total += line.getTotal();
        } 
    }

    public void removeLine(OrderLine line) {
        if (orderLines.remove(line)) {
            total -= line.getTotal();
        }
    }

    public double getTotal() {
        return total;
    }

    public String getCurrency() {
        return currency;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public ArrayList<OrderLine> getOrderLines() {
        return orderLines;
    }
}
