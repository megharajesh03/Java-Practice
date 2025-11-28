package com.example.web.dao;

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

import com.example.web.bean.FlightBean;

@Repository
public class FlightDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	int i=0;
	public int addFlight(FlightBean fb) {
		jdbcTemplate.execute("insert into flight values(?,?,?,?)", new PreparedStatementCallback<FlightBean>() {
			@Override
			public FlightBean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException{
				ps.setString(1, fb.getFlightID());
				ps.setString(2, fb.getFlightName());
				ps.setInt(3, fb.getSeatingCapacity());
				ps.setInt(4, fb.getSeatingCapacity());
				i=ps.executeUpdate();
				return null;
			}
		});
		return i;

	}

	public int updateFlight(FlightBean fb) {
		return jdbcTemplate.update(
				"UPDATE flight SET FlightName = ?, SeatingCapacity = ?, ReservationCapacity = ? WHERE FlightID = ?",
				fb.getFlightName(),
				fb.getSeatingCapacity(),
				fb.getReservationCapacity(),
				fb.getFlightID()
				);
	}


	public int deleteFlight(String id) {
		return jdbcTemplate.update("delete from flight where FlightID = ?",id);

	}

	public ArrayList<FlightBean> selectAllFlights(){
		ArrayList<FlightBean> all=new ArrayList<FlightBean>();
		jdbcTemplate.query("select * from flight", new RowMapper<FlightBean>() {
			
			@Override
			public FlightBean mapRow(ResultSet rs, int rowNum) throws SQLException {
				FlightBean f=new FlightBean();
				f.setFlightID(rs.getString(1));
				f.setFlightName(rs.getString(2));
				f.setSeatingCapacity(rs.getInt(3));
				f.setReservationCapacity(rs.getInt(4));
				all.add(f);
				return null;
			}
		});
		return all;
	}
}
