package com.devsuperior.dscommerce.dto;


import com.devsuperior.dscommerce.entities.Order;
import com.devsuperior.dscommerce.entities.OrderItem;
import com.devsuperior.dscommerce.entities.OrderStatus;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class OrderDTO {
    private Long id;
    private Instant moment;
    private OrderStatus status;
    private ClientDTO client;
    private PaymentDTO paymentDTO;

    private List<OrderItemDTO> items = new ArrayList<>();
    private Double total;


    public OrderDTO(){

    }

    public OrderDTO(Order order){
        id = order.getId();
        moment = order.getMoment();
        status = order.getStatus();
        client = new ClientDTO(order.getClient());
        paymentDTO = (order.getPayment() == null ? null:  new PaymentDTO(order.getPayment()));
        for(OrderItem orderItem: order.getItems()){
            items.add(new OrderItemDTO(orderItem));
        }
    }

    public Long getId() {
        return id;
    }

    public List<OrderItemDTO> getItems() {
        return items;
    }

    public PaymentDTO getPaymentDTO() {
        return paymentDTO;
    }

    public ClientDTO getClient() {
        return client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Instant getMoment() {
        return moment;
    }

    public Double getTotal() {
        double sum = 0;
        for(OrderItemDTO ordDto: items){
            sum += ordDto.getSubtotal();
        }
        return sum;
    }
}
