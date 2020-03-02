
package com.Test.repository;

import com.Test.model.User;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

// TODO: Auto-generated Javadoc
/**
 * The Interface TestRepository.
 */
public interface UserRepository extends JpaRepository<User, UUID> {

	User getUserByUserId(UUID userId);

}
