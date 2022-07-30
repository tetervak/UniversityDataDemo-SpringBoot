package ca.tetervak.universitydatademo.repo;

import ca.tetervak.universitydatademo.domain.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * DataSource Management for the Students at the University.
 *
 * Created by maryellenbowman
 */
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
