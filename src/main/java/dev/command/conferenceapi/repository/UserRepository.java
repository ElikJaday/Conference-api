package dev.command.conferenceapi.repository;

import dev.command.conferenceapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface User repository.
 *
 * @author Elvir Ibrahimov
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}