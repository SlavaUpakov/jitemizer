package com.jitemizer.data.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class JItemEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    protected JItemEntity() {        
    }
}
