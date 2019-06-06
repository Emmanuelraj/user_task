/**
 * 
 */
package com.example.gizbeltest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Emmanuel Raj
 * Task pojos
 */
@Entity
@Table(name="task")
public class TasksDTO 
{
	
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @Column(name="task_id")
   private Integer id;
   
   @Column(name="task_name")
   private String taskName;
   
   @Column(name="task_desc")
   private String taskDesc;
   
   
   
   @Column(name = "user_id")
   private Integer userId;
   
   
   @Column(name="task_status")
   private String taskStatus;
   
   
   
   
   
   /**
    * 
    * @return
    */
   public Integer getUserId() {
       return userId;
   }

   /**
    * 
    * @param userId
    */
   public void setUserId(Integer userId) {
       this.userId = userId;
   }
	
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
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}
	
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	/**
	 * @return the taskDesc
	 */
	public String getTaskDesc() {
		return taskDesc;
	}
	
	/**
	 * @param taskDesc the taskDesc to set
	 */
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}
	
	
	
	
	   
	   /**
	 * @return the taskStatus
	 */
	public String getTaskStatus() {
		return taskStatus;
	}

	/**
	 * @param taskStatus the taskStatus to set
	 */
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}


	
	public TasksDTO() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TasksDTO [id=" + id + ", taskName=" + taskName + ", taskDesc="
				+ taskDesc + ", userId=" + userId + ", taskStatus="
				+ taskStatus + "]";
	}
	   
   

}
