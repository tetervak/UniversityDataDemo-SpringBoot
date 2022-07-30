package ca.tetervak.universitydatademo.repo;

import ca.tetervak.universitydatademo.domain.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * DataSource Management for the Staff at the University.
 *
 * Created by maryellenbowman
 */
public interface StaffRepository extends PagingAndSortingRepository<Staff,Integer> {
}
