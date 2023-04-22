package com.example.oblig3c;

import jakarta.persistence.OrderBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
public class BillettController {

    @Autowired
    BillettRepository billettRepository;


    @GetMapping("/lagre")
    public String lagreBillett(Billett innBillett){
        billettRepository.save(innBillett);
        return "Success - Student added";
    }



    @GetMapping("/slettAlle")
    public String slettAlle(){
        billettRepository.deleteAll();
        return "Billetter slettet";
    }



    @GetMapping("/hentAlleBilletter3")
    public List<Billett> hentAlleBilletter3(){
        List<Billett> studentList = billettRepository.finnAlleBilletter();
        return studentList;
    }


    @GetMapping("/hentAlleBilletter2")
    public List<Billett> hentAlleBilletter2(){
        List<Billett> studentList = billettRepository.findAllByOrderByEtternavnAsc();
        return studentList;
    }

}


