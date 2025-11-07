package pack.subpack;



import java.util.*;

public class MapDemo1 {
	public static void main(String[] args) {
		HashMap<CompanyBean,EmployeeBean> hm=new HashMap<CompanyBean,EmployeeBean>();
		hm.put(new CompanyBean("UST", 101, "Trivandrum"), new EmployeeBean(101, "Karthik", 45000));
		hm.put(new CompanyBean("TCS", 102, "Chennai"), new EmployeeBean(102, "Praveen", 55000));
		hm.put(new CompanyBean("UST", 103, "Bangalore"), new EmployeeBean(103, "Vijay", 65000));
		hm.put(new CompanyBean("TCS", 104, "Bangalore"), new EmployeeBean(104, "Pavan", 75000));
		hm.put(new CompanyBean("Wipro", 105, "Chennai"), new EmployeeBean(105, "Gokul", 56000));
		for(Map.Entry m:hm.entrySet())
		{
			CompanyBean cmp=(CompanyBean)m.getKey();
			EmployeeBean emp=(EmployeeBean)m.getValue();
			
//			if(cmp.getCmpName().equals("UST"))
//			{
//				System.out.println(emp.getEmpname());
//			}
			if(emp.getEmpsal()>=70000)
			{
				System.out.println(emp.getEmpname());
			}
			
		}
		
	}
}