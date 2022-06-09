package nbaldassarri.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import nbaldassarri.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

  boolean existsByUsername(String username);

  Users findByUsername(String username);

  @Transactional
  void deleteByUsername(String username);

}
