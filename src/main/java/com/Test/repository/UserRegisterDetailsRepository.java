
package com.Test.repository;

import com.Test.model.UserRegisterDetails;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

// TODO: Auto-generated Javadoc
/**
 * The Interface TestRepository.
 */
public interface UserRegisterDetailsRepository extends JpaRepository<UserRegisterDetails, UUID> {

	UserRegisterDetails getUserByUserId(UUID userId);

	UserDetails findOneByEmail(String username);

}
