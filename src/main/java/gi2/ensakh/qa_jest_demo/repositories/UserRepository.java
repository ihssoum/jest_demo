package gi2.ensakh.qa_jest_demo.repositories;

import gi2.ensakh.qa_jest_demo.entities.AppUser ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<AppUser , Long> {
}
