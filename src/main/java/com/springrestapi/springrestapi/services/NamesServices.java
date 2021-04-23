package com.springrestapi.springrestapi.services;

import java.util.List;

import com.springrestapi.springrestapi.entities.names;

public interface NamesServices {

	public List<names> getnames();
	
	public names getname(long empid);
	
	public names addname(names name);
	
	public names updatename(names name);
	
	public void deletename(long parseLong);
}
