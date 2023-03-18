package com.portfolioarg.eb.Security.Repository;

import com.portfolioarg.eb.Security.Enums.RolNombre;
import com.portfolioarg.eb.Security.entity.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol>findByRolNombre(RolNombre rolNombre);
    
}
