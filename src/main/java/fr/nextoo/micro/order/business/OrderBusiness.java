package fr.nextoo.micro.order.business;


import fr.nextoo.micro.order.dto.OrderDto;
import fr.nextoo.micro.order.dto.transformer.OrderTransformer;
import fr.nextoo.micro.order.persistence.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderBusiness {

    @Autowired
    OrderRepository orderRepository;

    public List<OrderDto> getAll() {

        return new ArrayList<>(OrderTransformer.entityToDto(orderRepository.findAll()));
    }
}
