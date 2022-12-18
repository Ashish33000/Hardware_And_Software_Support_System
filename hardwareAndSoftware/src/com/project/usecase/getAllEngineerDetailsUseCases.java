
package com.project.usecase;

import java.util.List;

import com.project.dao.HodDao;
import com.project.dao.HodDaoImpl;
import com.project.exception.EngineerException;
import com.project.model.Engineer;
import com.project.model.Hod;

public class GetAllEngineerDetailsUseCases {

	public static void main(String[] args) {
		
	   HodDao dao=new HodDaoImpl();
	   try {
		   List<Engineer> engineer=dao.getAllEngineerDetails();
		   engineer.forEach(eng->{
			   System.out.println("Engineer id is: "+eng.getEid());
			   System.out.println("Engineer name is: "+eng.getName());
			   System.out.println("Engineer address is: "+eng.getAddress());
			   System.out.println("Engineer Email is: "+eng.getEmail());
			   System.out.println("Engineer Password is: "+eng.getPassword());
			   System.out.println("Engineer Ctegory is: "+eng.getCategory());
			   System.out.println("=============================================");
		   });
		
	} catch (EngineerException e) {
		// TODO: handle exception
		e.printStackTrace();
	}

	}

}
