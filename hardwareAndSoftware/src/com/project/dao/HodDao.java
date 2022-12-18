package com.project.dao;

import java.util.List;

import com.project.exception.EngineerException;
import com.project.exception.HodException;
import com.project.exception.ProblemException;
import com.project.model.Engineer;
import com.project.model.Hod;
import com.project.model.Problem;

public interface HodDao {
	
	public Hod loginHod(String username,String password) throws HodException;
	public String registerEngineer(Engineer engineer) throws EngineerException;
	public List<Engineer> getAllEngineerDetails() throws EngineerException;
	public String DeleteEngineer(int eid) throws EngineerException;
	public String AsignProblemToEngineer(Problem problems) throws ProblemException;
	
	
 
}
