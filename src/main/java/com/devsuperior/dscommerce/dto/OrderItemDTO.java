package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;
import com.devsuperior.dscommerce.entities.Product;

public class OrderItemDTO {
    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;
    private Double subtotal;

    public OrderItemDTO(){}

    public OrderItemDTO(OrderItem orderItem){
        productId = orderItem.getProduct().getId();
        name = orderItem.getProduct().getName();
        price = orderItem.getProduct().getPrice();
        quantity = orderItem.getQuantity();
        subtotal = quantity * price;

    }

    public Long getProductId() {
        return productId;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
