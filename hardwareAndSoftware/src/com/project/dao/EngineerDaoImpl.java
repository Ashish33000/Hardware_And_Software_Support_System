package com.project.dao;

import java.util.List;

import com.project.exception.EngineerException;
import com.project.exception.ProblemException;
import com.project.model.Engineer;
import com.project.model.Problem;

public class EngineerDaoImpl implements EngineerDao {

	@Override
	public Engineer loginEngineer(String username, String password) throws EngineerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Problem> getAllProblemDetails() throws ProblemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateProblmStatus(String status) throws ProblemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Problem> AllProblemAttendedByEngineer(int pid, String problem) throws ProblemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changepassword(String password) throws EngineerException {
		// TODO Auto-generated method stub
		return null;
	}

}
