package fr.nextoo.micro.order.persistence.repository;

import fr.nextoo.micro.order.persistence.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Collection;

@Repository
@Transactional
public interface OrderRepository extends CrudRepository<OrderEntity,Long> {

    Collection<OrderEntity> findAll();

    OrderEntity findById(int id);
}
