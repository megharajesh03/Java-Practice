package pack.subpack;

public class CompanyBean {
	private String cmpName;
	private int empid;
	private String cmpAddress;
	public CompanyBean(String cmpName, int empid, String cmpAddress) {
		this.cmpName = cmpName;
		this.empid = empid;
		this.cmpAddress = cmpAddress;
	}
	public String getCmpName() {
		return cmpName;
	}
	public int getEmpid() {
		return empid;
	}
	public String getCmpAddress() {
		return cmpAddress;
	}
	@Override
	public String toString() {
		return "CompanyBean [cmpName=" + cmpName + ", empid=" + empid + ", cmpAddress=" + cmpAddress + "]\n";
	}

}