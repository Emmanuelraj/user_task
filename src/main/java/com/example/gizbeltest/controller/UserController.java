/**
 * 
 */
package com.example.gizbeltest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.gizbeltest.model.TasksDTO;
import com.example.gizbeltest.model.UserDTO;
import com.example.gizbeltest.service.UserTaskService;

/**
 * @author Emmanuel Raj
 *  purpose: This controls the web flow
 *  
 */
@RestController
@RequestMapping("/user-task")
public class UserController 
{
	
	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserTaskService userTaskService;
	
<<<<<<< HEAD
=======
	
>>>>>>> initial commit
	/**
	 * 
	 * @return
	 */
	@GetMapping("/all")
	public ModelAndView getData(@ModelAttribute("user")UserDTO userDTO)
	{		
		List<UserDTO> users = userTaskService.findAll();	
		return new ModelAndView("view", "users",users);
	}
	
	
<<<<<<< HEAD
	@GetMapping("/add")
	public ModelAndView getAddTaskUserData(@ModelAttribute("user")UserDTO userDTO,BindingResult bindingResult)
	{		
		
		
		logger.info(userDTO.getUsername());
		return new ModelAndView("addTaskUser");
	}
=======
>>>>>>> initial commit
	
	
	
	
	
	/**
	 * 
	 * @param userDTO
	 * @return
	 */
	
	@PostMapping("/save")
    public String saveData(@RequestBody UserDTO userDTO)
    {
		logger.info("saveData");
		TasksDTO dto = new TasksDTO();
		dto.setUserId(userDTO.getId());
		System.out.println(userDTO.getTasksList()+""+dto.getId());		
		return this.userTaskService.saveData(userDTO);
		
		
	}
	
	
	
	
	
	
	@PutMapping("/editById/{id}")
	public String updateDataById(@RequestBody UserDTO userDto,@PathVariable("id")final Integer id)
	{
		logger.info("update Data method");
		//first findById	    
		/**
		 * 
		 */
		List<UserDTO> ls = this.userTaskService.findById(id);
<<<<<<< HEAD
	      for(UserDTO s: ls)
	      {
	    	  s.setId(userDto.getId());
	    	  s.setUsername(userDto.getUsername());	    	  
	    	  //save updated data into db
	    	  this.userTaskService.saveData(s);
	      }
=======
		
	      for(UserDTO s: ls)
	      {
	    	  //s.setId(userDto.getId());
	    	  s.setUsername(userDto.getUsername());	    	  
	    	  //save updated data into db	    	  
	    	  s.setTasksList(userDto.getTasksList());	    	  
	    	 
	    	  this.userTaskService.saveData(s);
	      }
	      
>>>>>>> initial commit
			return "record UpdateById";
		
	}
	
	/**
	 * 
	 * @param user
	 * @param id
	 * @return
	 */
	@GetMapping("/viewById/{id}")
	public  ModelAndView viewById(@PathVariable("id")int id)
	{
		logger.info("viewById"+id);
		
		return new ModelAndView("viewById","users",this.userTaskService.findById(id));
	}
	
	
	
<<<<<<< HEAD
	@GetMapping("/editById/{id}")
	public  ModelAndView editById(@PathVariable("id")int id,@ModelAttribute("tasks")TasksDTO tasks,BindingResult bindingResult)
	{
		logger.info("editById ------>"+id);		
		
		
		return new ModelAndView("editById","tasks",this.userTaskService.findById(id));
		
	}
	
	
	
	@DeleteMapping(value="/deleteById/{id}")
	public String deleteById(@PathVariable("id")int id)
=======

	
	
	@GetMapping(value="/deleteById/{id}")
	public ModelAndView deleteById(@PathVariable("id")int id , @ModelAttribute("user")UserDTO userDTO)
>>>>>>> initial commit
	{
		logger.info("deleteById"+id);
		
		//deleteById
		this.userTaskService.deleteById(id);
		//findAll
		this.userTaskService.findAll();
		
		 
<<<<<<< HEAD
		return "redirect:/user-task/all";
=======
		List<UserDTO> users = userTaskService.findAll();	
		return new ModelAndView("view", "users",users);
>>>>>>> initial commit
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
