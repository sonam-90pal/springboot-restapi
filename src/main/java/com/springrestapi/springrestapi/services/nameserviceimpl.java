package com.springrestapi.springrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestapi.springrestapi.entities.names;

@Service
public class nameserviceimpl implements NamesServices {
	
	List<names> list;
	
	public nameserviceimpl() {
		
	  list=new ArrayList<>();
	  list.add(new names(10, "James","Accountant"));
	  list.add(new names(20,"Sam","Guard"));
	  
		
	}

	@Override
	public List<names> getnames() {
		
		return list;
	}
	
	@Override
	public names getname(long empid) {
		
		names m=null;
		for(names name:list) {
			if(name.getEmpid()==empid)
            {
	           m=name;
	           break;
            }
                }
		
		return m;
	}
	
	@Override
	public names addname(names name) {
		list.add(name);
		return name;
	}

}
