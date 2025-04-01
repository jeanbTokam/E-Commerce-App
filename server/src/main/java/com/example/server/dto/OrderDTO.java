package com.example.server.dto;

import java.util.List;

public class OrderDTO {

    private Long id;
    private String customerName;
    private Double totalAmount;
    private List<OrderItemDTO> items;
}
