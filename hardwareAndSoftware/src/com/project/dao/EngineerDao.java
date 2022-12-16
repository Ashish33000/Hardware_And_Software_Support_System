package com.project.dao;

import java.util.List;

import com.project.exception.EngineerException;
import com.project.exception.ProblemException;
import com.project.model.Engineer;
import com.project.model.Problem;

public interface EngineerDao {
	
	public Engineer loginEngineer(String username,String password) throws EngineerException;
	public List<Problem> getAllProblemDetails() throws ProblemException; 
	public String updateProblmStatus(String status) throws ProblemException;	
	public List<Problem> AllProblemAttendedByEngineer(int pid,String problem)throws ProblemException;
	public String changepassword(String password) throws EngineerException;
	

}
