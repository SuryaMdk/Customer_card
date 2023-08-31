/**
 * UserRepository.java
 * This interface provides all the crud methods 
 * 
 * Author: Surya Prakash
 * Contact: suryamdk5@gmail.com
 * 
 * Created on: 2023-08-29
 */

package com.example.card;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
