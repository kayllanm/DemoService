package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(collectionResourceRel = "animal", path = "animal")
public interface AnimalRepository extends CrudRepository<Animal, Long> {

	List<Animal> findByType(@Param("type") String type);

}