package hieuvd.demo.data.repository;

import hieuvd.demo.data.model.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
    @Query(value = "select * from task  where task.complete_flag = :complete_flag and task.delete_flag = 0", nativeQuery = true)
    Page<Task> findAll(Integer complete_flag,Pageable var1);
    Task findById(Integer id);
}
