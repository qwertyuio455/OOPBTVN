/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlyhoadonbanhang;

import java.util.Iterator;

/**
 *
 * @author Administrator
 */
public class QuanLyHoaDonBanHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tạo danh sách hóa đơn
        OrderList orderList = new OrderList();

        // Tạo khách hàng
        Customer customer1 = new Customer("Ha Noi", "KH001", "Nguyen Van A");

        // Tạo một hóa đơn mới cho khách hàng
        Order order1 = new Order(customer1, "VND");

        // Thêm các mặt hàng vào hóa đơn
        OrderLine line1 = new OrderLine("San pham 1", 2, 50000, "VND");
        OrderLine line2 = new OrderLine("San pham 2", 1, 100000, "VND");

        order1.addLine(line1);  
        order1.addLine(line2);  

        // Thêm hóa đơn vào danh sách hóa đơn
        orderList.add(order1);

        // Tạo một hóa đơn khác và thêm vào danh sách
        Order order2 = new Order(customer1, "VND");
        OrderLine line3 = new OrderLine("San pham 3", 3, 20000, "VND");
        order2.addLine(line3);  // Thêm mặt hàng 3
        orderList.add(order2);

        // In thông tin các hóa đơn trước khi xóa
        System.out.println("Danh sach hoa don truoc khi xoa:");
        printOrderList(orderList);
        
        // Xóa mặt hàng 2 khỏi hóa đơn 1
        order1.removeLine(line2);

        // Xóa hóa đơn 2 khỏi danh sách hóa đơn
        orderList.remove(order2);

        // In thông tin các hóa đơn sau khi xóa
        System.out.println("\nDanh sach hoa don sau khi xoa:");
        printOrderList(orderList);
    }

    // Phương thức in thông tin của tất cả các hóa đơn trong danh sách
    private static void printOrderList(OrderList orderList) {
        Iterator<Order> iterator = orderList.getIterator(); 
        while (iterator.hasNext()) {
            // Lấy từng hóa đơn trong danh sách
            Order order = iterator.next();
            
            System.out.println("Khach hang: " + order.getCustomer().getName());
            System.out.println("Ma khach hang: " + order.getCustomer().getCode());
            System.out.println("Don vi tien: " + order.getCurrency());
            System.out.println("Tong thanh toan: " + order.getTotal() + " " + order.getCurrency());
            System.out.println("Cac mat hang:");

            for (OrderLine line : order.getOrderLines()) {
                System.out.println("- " + line.getName() + ": " + "\n" +
                                   " + " + "So luong: " + line.getQuantity() + "\n" +
                                   " + " + "Don gia: " + line.getPrice() + "\n" +
                                   " + " + "Thanh toan: " + line.getTotal() + " " + line.getCurrency());
            }
            System.out.println();
        }
    }
}
