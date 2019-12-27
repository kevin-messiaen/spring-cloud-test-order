package fr.nextoo.micro.order.controller;

import fr.nextoo.micro.order.business.OrderBusiness;
import fr.nextoo.micro.order.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderBusiness orderBusiness;

    @GetMapping
    private ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }


//    @GetMapping
//    private List<OrderDto> getOrders(){
//
//        return orderBusiness.getAll();
//    }


}
