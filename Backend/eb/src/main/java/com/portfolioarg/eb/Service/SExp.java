package com.portfolioarg.eb.Service;

import com.portfolioarg.eb.Entity.Exp;
import com.portfolioarg.eb.Repository.RExp;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExp {
    @Autowired 
    RExp rExp;
    
    
    public List<Exp> list(){
        return rExp.findAll();
        
    }
    public Optional<Exp> getOne(int id){
        return rExp.findById(id);
    }
    public Optional<Exp> getByNombreE(String nombreE){
            return rExp.findByNombreE(nombreE);
          }
    public void save(Exp exp){
        rExp.save(exp);
    }
    public void delete(int id){
        rExp.deleteById(id);
    }
    public boolean existById(int id){
        return rExp.existsById(id);
    }
    public boolean existByNombreE(String nomnbreE){
        return rExp.existsByNombreE(nomnbreE);
    }
            
            
            
}
