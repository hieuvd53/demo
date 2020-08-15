package hieuvd.demo.data.service;

import hieuvd.demo.data.model.PaginableItemList;
import hieuvd.demo.data.model.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

public interface TaskService {
    boolean insertTask(Task task);

    PaginableItemList<Task> findByOrderByIdDesc(Integer pageNo, Integer pageSize, String sortBy);
    Task findById(Integer id);
}
