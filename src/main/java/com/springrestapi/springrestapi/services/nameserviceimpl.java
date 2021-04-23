package com.springrestapi.springrestapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestapi.springrestapi.dao.namesdao;
import com.springrestapi.springrestapi.entities.names;

@Service
public class nameserviceimpl implements NamesServices {
	
	@Autowired
	private namesdao dao;
//	List<names> list;
	
	public nameserviceimpl() {
		
//	  list=new ArrayList<>();
	//  list.add(new names(10, "James","Accountant"));
	//  list.add(new names(20,"Sam","Guard"));
	  
		
	}

	@Override
	public List<names> getnames() {
		
		return dao.findAll();
	}
	
	@Override
	public names getname(long empid) {
		
	//	names m=null;
	//  for(names name:list) {
	//		if(name.getEmpid()==empid)
     //       {
	 //         m=name;
	 //          break;
     //     }
      //         }
		
		return dao.getOne(empid);
	}
	
	@Override
	public names addname(names name) {
	//	list.add(name);
		
		dao.save(name);
		return name;
	}
	
	@Override
	public names updatename(names name) {
	//	list.forEach(e -> {
	//		if(e.getEmpid() == name.getEmpid()) {
	//			e.setName(name.getName());
	//			e.setJob(name.getJob());
	//			
	//		}
	//	});
		
		dao.save(name);
		return name;
	}
	
	@Override
	public void deletename(long parseLong) {
	//	list=this.list.stream().filter(e->e.getEmpid()!=parseLong).collect(Collectors.toList());
	names entity = dao.getOne(parseLong);
	dao.delete(entity);
	}

}
