package com.portfolioarg.eb.Security.Service;

import com.portfolioarg.eb.Security.Enums.RolNombre;
import com.portfolioarg.eb.Security.Repository.iRolRepository;
import com.portfolioarg.eb.Security.entity.Rol;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol>getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
        
    }
    
}
