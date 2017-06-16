package ph.com.ibm.cvp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "department", path = "department")
public interface DepartmentRepository extends MongoRepository<Department, String> {
	
	
}
