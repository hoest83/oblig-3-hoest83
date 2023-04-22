package com.example.oblig3c;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillettRepository extends JpaRepository<Billett,Long> {

    @Query(value = "SELECT e FROM Billett e order by etternavn")
    List<Billett> finnAlleBilletter();

    public List<Billett> findAllByOrderByEtternavnAsc();

}

