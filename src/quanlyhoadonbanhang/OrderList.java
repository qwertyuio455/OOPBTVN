/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyhoadonbanhang;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Administrator
 */
public class OrderList {
    private ArrayList<Order> orders = new ArrayList<>();

    // Thêm hóa đơn vào danh sách
    public void add(Order order) {
        orders.add(order);
    }

    // Xóa hóa đơn khỏi danh sách
    public void remove(Order order) {
        orders.remove(order);
    }

    // Lấy số lượng hóa đơn hiện có
    public int getCount() {
        return orders.size();
    }

    // Trả về một iterator để duyệt qua các hóa đơn
    public Iterator<Order> getIterator() {
        return orders.iterator();
    }
}
