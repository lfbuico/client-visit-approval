package ph.com.ibm.cvp;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ClientVisitApproval {
	
	@Id String id;
	
	String clientVisitRequestId;
	
	List<Approval> approvalList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClientVisitRequestId() {
		return clientVisitRequestId;
	}

	public void setClientVisitRequestId(String clientVisitRequestId) {
		this.clientVisitRequestId = clientVisitRequestId;
	}

	public List<Approval> getApprovalList() {
		return approvalList;
	}

	public void setApprovalList(List<Approval> approvalList) {
		this.approvalList = approvalList;
	}
	
	

}
