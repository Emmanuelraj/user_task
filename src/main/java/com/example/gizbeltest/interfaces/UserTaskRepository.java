/**
 * 
 */
package com.example.gizbeltest.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gizbeltest.model.UserDTO;

/**
 * @author Emmanuel Raj
 * extends JPI <classname, primarykey>
 * Purpose:store data jpa
 */

public interface UserTaskRepository  extends JpaRepository<UserDTO, Integer>
{
	//override 
	List<UserDTO> findById(int id);
}
