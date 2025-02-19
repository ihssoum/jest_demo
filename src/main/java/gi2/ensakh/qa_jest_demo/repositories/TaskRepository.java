package gi2.ensakh.qa_jest_demo.repositories;


import gi2.ensakh.qa_jest_demo.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task, Long> {
}

