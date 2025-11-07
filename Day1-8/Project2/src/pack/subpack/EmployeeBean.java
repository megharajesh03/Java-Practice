package pack.subpack;

public class EmployeeBean {
	private int empid;
	private String empname;
	private int empsal;
	public EmployeeBean(int empid, String empname, int empsal) {
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	@Override
	public String toString() {
		return "EmployeeBean [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]\n";
	}
}