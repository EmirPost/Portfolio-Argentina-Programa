package com.portfolioarg.eb.Dto;

import jakarta.validation.constraints.NotBlank;

public class DtoExp {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descriptionE;
    
    //Constructores

    public DtoExp() {
    }

    public DtoExp(String nombreE, String descriptionE) {
        this.nombreE = nombreE;
        this.descriptionE = descriptionE;
    }
   
    //Getters and Setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescriptionE() {
        return descriptionE;
    }

    public void setDescriptionE(String descriptionE) {
        this.descriptionE = descriptionE;
    }
    
    
    
}
