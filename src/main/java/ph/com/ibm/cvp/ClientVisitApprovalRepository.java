package ph.com.ibm.cvp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "approval", path = "approval")
public interface ClientVisitApprovalRepository extends MongoRepository<ClientVisitApproval, String> {
	
	
}
