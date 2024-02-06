package com.example.cyberParc.coucheDAO;

import com.example.cyberParc.ENTITY.DiplomeDemandeur;
import com.example.cyberParc.ENTITY.demandeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface diplomeDemandeurRepository extends JpaRepository<DiplomeDemandeur,Long> {

    DiplomeDemandeur findByDemandeur_Id(Long id);

    long deleteByDemandeur(demandeur demandeur);
}
