package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource(path = "animal") 
public interface getAnimalType extends CrudRepository<Animal, Long>{
	
	@RestResource(exported = false)
	List<Animal> findByType(@Param("type") String type);
}

//@RestController
//@RepositoryRestResource(collectionResourceRel = "animal", path = "animal")
//public interface AnimalRepository extends CrudRepository<Animal, Long> {
//
//	List<Animal> findByType(@Param("type") String type);
//
//}