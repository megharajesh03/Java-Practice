package com.example.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.bean.EmployeeBean;

@Repository
public class EmployeeDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	/*
	public int addEmployee(EmployeeBean eb) {
		return jdbcTemplate.update("insert into employee values('"+eb.getEid()+"','"+eb.getEname()+"','"+eb.getEsal()+"')");
		
	}
	*/
	int i=0;
	public int addEmployee(EmployeeBean eb) {
		jdbcTemplate.execute("insert into employee values(?,?,?)", new PreparedStatementCallback<EmployeeBean>() {
			@Override
			public EmployeeBean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException{
				ps.setInt(1, eb.getEid());
				ps.setString(2, eb.getEname());
				ps.setInt(3, eb.getEsal());
				i=ps.executeUpdate();
				return null;
			}
		});
		return i;
		
	}
	public int updateEmployee(EmployeeBean eb) {
		return jdbcTemplate.update("update employee set name = '"+eb.getEname()+"',salary='"+eb.getEsal()+"'where id='"+eb.getEid()+"'");
		
	}
	
	public int deleteEmployee(int id) {
		return jdbcTemplate.update("delete from employee where id ="+id);
		
	}
	
	public ArrayList<EmployeeBean> selectAll(){
		ArrayList<EmployeeBean> al = new ArrayList<EmployeeBean>();
		jdbcTemplate.query("select * from employee", new RowMapper<EmployeeBean>() {
		
		@Override
		public EmployeeBean mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmployeeBean e = new EmployeeBean();
			e.setEid(rs.getInt(1));
			e.setEname(rs.getString(2));
			e.setEsal(rs.getInt("salary"));
			al.add(e);
			
			return e;
		}});
		return al;
	}

}
