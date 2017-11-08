package com.lordgasmic.keno.db.repository;

import org.springframework.data.repository.Repository;

import com.lordgasmic.keno.db.persistence.Draw;

/**
 * @author nwellman
 */
public interface DrawRepository extends Repository<Draw, Integer> {

    /**
     * Get the customer site for the provided siteId
     * 
     * @param siteId
     * @return The CustomerSite
     */
    Draw findByDrawNum(int drawNum);
}
