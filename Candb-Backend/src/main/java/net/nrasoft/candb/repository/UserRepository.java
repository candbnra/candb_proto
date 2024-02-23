package net.nrasoft.candb.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.nrasoft.candb.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}