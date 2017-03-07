package net.MyProjectTEST.security.dao;

import net.MyProjectTEST.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
