package com.example.web.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.bean.FlightBean;
import com.example.web.dao.FlightDAO;

@Service
public class FlightService {
	@Autowired
	private FlightDAO fdao;
	public int addFlight(FlightBean fb) {
		return fdao.addFlight(fb);
	}
	public int updateFlight(FlightBean fb) {
		return fdao.updateFlight(fb);
	}
	public int deleteFlight(String id) {
		return fdao.deleteFlight(id);
	}
	public ArrayList<FlightBean> selectAllFlights(){
	return fdao.selectAllFlights();
	}

}
