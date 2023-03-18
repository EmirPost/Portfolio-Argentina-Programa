package com.portfolioarg.eb.Controller;

import com.portfolioarg.eb.Dto.DtoExp;
import com.portfolioarg.eb.Entity.Exp;
import com.portfolioarg.eb.Mensaje;
import com.portfolioarg.eb.Service.SExp;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin(origins = "htttp://localhost:4200")

public class CExp {
    @Autowired
    SExp sExp;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Exp>> list(){
        List<Exp> list= sExp.list();
        return new ResponseEntity(list,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoExp dtoExp){
        if(StringUtils.isBlank(dtoExp.getNombreE()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
              if (sExp.existByNombreE(dtoExp.getNombreE()))
            return new ResponseEntity (new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        Exp exp = new Exp(dtoExp.getNombreE(), dtoExp.getDescriptionE());
        sExp.save(exp);
        return new ResponseEntity (new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoExp dtoExp){
        
        if (!sExp.existById(id))
            return new ResponseEntity (new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
   
        if (sExp.existByNombreE(dtoExp.getNombreE()) && sExp.getByNombreE(dtoExp.getNombreE()).get().getId()!= id)

            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        
        if (StringUtils.isAllBlank(dtoExp.getNombreE()))
            return new ResponseEntity (new Mensaje ("El campo es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Exp exp = sExp.getOne(id).get();
        exp.setNombreE(dtoExp.getNombreE());
        exp.setDescriptionE(dtoExp.getDescriptionE());
        
        sExp.save(exp);
        return new ResponseEntity(new Mensaje ("Experiencia actualizada"), HttpStatus.OK);
        
    }
    public ResponseEntity<?> delete(@PathVariable("id") int id){
    
        if (!sExp.existById(id))
            return new ResponseEntity (new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        
        sExp.delete(id);
        
        return new ResponseEntity(new Mensaje ("Experiencia eliminada"), HttpStatus.OK);    
}
    
    
}