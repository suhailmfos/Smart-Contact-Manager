package com.smart.dao;


import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smart.entities.Contact;
import com.smart.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, UUID> {
	//pagination...
	
//	@Query("from Contact as c where c.user.id =:userId")
//	//currentPage-page
//	//Contact Per page - 5
//	public Page<Contact> findContactsByUser(@Param("userId")int userId, Pageable pePageable);
//
//	//search
//	public List<Contact> findByNameContainingAndUser(String name,User user);
	
}
