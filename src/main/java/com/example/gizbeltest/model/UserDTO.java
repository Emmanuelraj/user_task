/**
 * 
 */
package com.example.gizbeltest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Emmanuel Raj
 *  
 *  pojos of user
 *
 */
@Entity
@Table(name="user_dto")  //tablename 
public class UserDTO 
{
	
	/**
	 * id for primary key
	 *  autogenerate
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	@NotNull
	private Integer id;
	/**
	 * string username
	 */
	@Column(name="user_name")
	private String username;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	/**
	 * one to many join mechanism
	 * 
	 */
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	private List<TasksDTO> tasksList;
	
	
	/**
	 * @return the tasksList
	 */
	public List<TasksDTO> getTasksList() {
		return tasksList;
	}
	/**
	 * @param tasksList the tasksList to set
	 */
	public void setTasksList(List<TasksDTO> tasksList) {
		this.tasksList = tasksList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
