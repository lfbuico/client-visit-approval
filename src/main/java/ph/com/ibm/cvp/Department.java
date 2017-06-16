package ph.com.ibm.cvp;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Department {
	
	@Id String id;
	
	String name;
	
	List<Approver> approvers;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Approver> getApprovers() {
		return approvers;
	}

	public void setApprovers(List<Approver> approvers) {
		this.approvers = approvers;
	}
	
}
