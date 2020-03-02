
package com.Test.repository;

import com.Test.model.User;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

// TODO: Auto-generated Javadoc
/**
 * The Interface TestRepository.
 */
public interface TestRepository extends JpaRepository<User, Integer> {

	/**
	 * Gets the user by user id.
	 *
	 * @param userId the user id
	 * @return the user by user id
	 */
	User getUserByUserId(UUID userId);

}
