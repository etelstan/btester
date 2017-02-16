package btester.repository;

import btester.model.Build;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Yuri Yerokhin
 * @version 1.0
 * @since 16.02.2017
 */
public interface BuildRepository extends CrudRepository<Build, Long> {
}
