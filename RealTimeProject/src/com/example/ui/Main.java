package com.example.ui;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.example.bean.EmployeeBean;
import com.example.dao.AdministratorDAO;
/*
public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ustglobal","root","pass@word1");
		System.out.println("Connected succesfully");
		//now java is connected to database

		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
		ps.setInt(1, 101);
		ps.setString(2, "Karthik");
		ps.setInt(3, 45000);
		
		int i=ps.executeUpdate();
		System.out.println(i+" record inserted successfully");
	}
}
*/

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		ArrayList<EmployeeBean> al =AdministratorDAO.selectAllEmployee();
		String str="";
		for(EmployeeBean e:al) {
			str+=e.getId()+" "+e.getName()+" "+e.getSalary()+"\n";
		}
		JOptionPane.showMessageDialog(null, str);
		
		
		
		/*
		int id=Integer.parseInt(JOptionPane.showInputDialog("Enter Employee ID :"));
//		JOptionPane.showMessageDialog(null, AdministratorDAO.deleteEmployee(id)+" record deleted successfully...");
		JOptionPane.showMessageDialog(null, AdministratorDAO.selectEmployeeById(id));
		*/
		
		/*
		
		String name =JOptionPane.showInputDialog("Enter Employee Name :");
		int salary=Integer.parseInt(JOptionPane.showInputDialog("Enter Salary :"));
		EmployeeBean eb = new EmployeeBean();
		eb.setId(id);
		eb.setName(name);
		eb.setSalary(salary);
//		JOptionPane.showMessageDialog(null, AdministratorDAO.addEmployee(eb)+" record inserted successfully...");
//		JOptionPane.showMessageDialog(null, AdministratorDAO.updateEmployee(eb)+" record updated successfully...");
		*/
	}
}
