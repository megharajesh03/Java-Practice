package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.EmployeeBean;
import com.example.dao.EmployeeDAO;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO edao;
	public int addEmployee(EmployeeBean eb) {
		return edao.addEmployee(eb);
	}
	public int updateEmployee(EmployeeBean eb) {
		return edao.updateEmployee(eb);
	}
	public int deleteEmployee(int id) {
		return edao.deleteEmployee(id);
	}
}
