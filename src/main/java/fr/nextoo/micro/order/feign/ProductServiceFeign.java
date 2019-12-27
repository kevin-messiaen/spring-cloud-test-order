package fr.nextoo.micro.order.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductServiceFeign {

}
