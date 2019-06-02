package pl.sda.springbootweb9.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.springbootweb9.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
