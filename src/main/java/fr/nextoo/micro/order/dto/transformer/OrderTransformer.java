package fr.nextoo.micro.order.dto.transformer;

import fr.nextoo.micro.order.dto.OrderDto;
import fr.nextoo.micro.order.persistence.entity.OrderEntity;
import fr.nextoo.micro.order.persistence.repository.OrderRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderTransformer {

    @Autowired
    OrderRepository orderRepository;

    public static Collection<OrderDto> entityToDto(Collection<OrderEntity> orderEntityCollection){

        if(orderEntityCollection == null)
            return null;

        List<OrderDto> orderDtoList = new ArrayList<>();
        for(OrderEntity orderEntity: orderEntityCollection){
            orderDtoList.add(entityToDto(orderEntity));
        }

        return orderDtoList;
    }


    public static OrderDto entityToDto(OrderEntity orderEntity){

        if(orderEntity == null)
            return null;

        OrderDto orderDto = new OrderDto();
        orderDto.setId(orderEntity.getId());
        orderDto.setIdUser(orderEntity.getIdClient());

        return orderDto;
    }
}
