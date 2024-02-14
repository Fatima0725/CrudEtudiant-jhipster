package com.groupeisi.repository;

import com.groupeisi.domain.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {}
