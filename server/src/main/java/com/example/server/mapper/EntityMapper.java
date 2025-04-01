package com.example.server.mapper;

import com.example.server.dto.*;
import com.example.server.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EntityMapper {
    EntityMapper INSTANCE = Mappers.getMapper(EntityMapper.class);

    // User Mapping
    @Mapping(target = "password", ignore = true) // Do not expose password
    UserDTO userToUserDTO(User user);
    User userDTOToUser(UserDTO userDTO);

    // Order Mapping
    OrderDTO orderToOrderDTO(Order order);
    Order orderDTOToOrder(OrderDTO orderDTO);

    // OrderItem Mapping
    OrderItemDTO orderItemToOrderItemDTO(OrderItem orderItem);
    OrderItem orderItemDTOToOrderItem(OrderItemDTO orderItemDTO);

    // Cart Mapping
    CartDTO cartToCartDTO(Cart cart);
    Cart cartDTOToCart(CartDTO cartDTO);

    // CartItem Mapping
    CartItemDTO cartItemToCartItemDTO(CartItem cartItem);
    CartItem cartItemDTOToCartItem(CartItemDTO cartItemDTO);

    // List Mappings
    List<OrderDTO> ordersToOrderDTOs(List<Order> orders);
    List<Order> orderDTOsToOrders(List<OrderDTO> orderDTOs);

    List<CartDTO> cartsToCartDTOs(List<Cart> carts);
    List<Cart> cartDTOsToCarts(List<CartDTO> cartDTOs);
}