package btester.repository;

import btester.model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Yuri Yerokhin
 * @version 1.0
 * @since 16.02.2017
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
