package com.project.dao;

import java.util.List;

import com.project.exception.EngineerException;
import com.project.exception.ProblemException;
import com.project.model.Engineer;
import com.project.model.Problem;

public interface EngineerDao {
	
	public Engineer loginEngineer(String username,String password) throws EngineerException;
	public List<Problem> getAllProblemDetails() throws ProblemException; 
	public String updateProblmStatus(int pid,String status) throws ProblemException;	
	public List<Problem> AllProblemAttendedByEngineer(String ename)throws ProblemException;
	public String changepassword(String username,String password) throws EngineerException;
	

}
