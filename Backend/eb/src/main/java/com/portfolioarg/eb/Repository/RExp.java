package com.portfolioarg.eb.Repository;

import com.portfolioarg.eb.Entity.Exp;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExp  extends JpaRepository<Exp, Integer>{
    public Optional<Exp> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
    
}
