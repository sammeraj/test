package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.model.City;

@Service
public class CityService implements CityServiceImp {

	@Autowired
	private JdbcTemplate jtm;

	/** Method to get record based on string passed
	 * @param name the search string
	 * @param count the count of record needed
	 */
	@Override
	public List<City> findByName(String name, String count) {

		String sql = "SELECT * FROM CITIES WHERE NAME like ? limit ?";

		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<City> cities= jtm.query(sql, new Object[]{name+"%",count},new BeanPropertyRowMapper(City.class));

		return cities;
	}
}