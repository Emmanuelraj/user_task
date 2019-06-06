/**
 * 
 */
package com.example.gizbeltest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.gizbeltest.model.UserDTO;
import com.example.gizbeltest.interfaces.UserTaskRepository;

/**
 * @author Emmanuel Raj
 * program name: userTaskService
 * purpose: configuation and business Logic and connect with DAO
 */
@Configuration
public class UserTaskService 
{
	/**
	 * userTaskRepository
	 */
    @Autowired
	private UserTaskRepository userTaskRepository;
	
    
    /**
     * 
     * @return List of userand their task
     */
    public List<UserDTO> getData()
    {
    	
    	return this.userTaskRepository.findAll();
    }
    
    
    public String saveData(UserDTO userDTO)
    {
    	this.userTaskRepository.save(userDTO);
    	
    	return "record saved";
    }


	public List<UserDTO> findById(int id) {
		// TODO Auto-generated method stub
		return this.userTaskRepository.findById(id);
	}


	public List<UserDTO> findAll() {
		// TODO Auto-generated method stub
		return this.userTaskRepository.findAll();
	}


	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
		this.userTaskRepository.deleteById(id);
		
	}
	
    
    
    
	
	
}
