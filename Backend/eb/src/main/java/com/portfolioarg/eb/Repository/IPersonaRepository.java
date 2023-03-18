package com.portfolioarg.eb.Repository;

import com.portfolioarg.eb.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository <Persona, Long> {
    
}
