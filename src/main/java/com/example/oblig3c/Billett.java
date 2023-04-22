package com.example.oblig3c;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "billett")
public class Billett {
    @Id
    @GeneratedValue
    private Integer id;
    private String fornavn;
    private String etternavn;
    private String telefonnummer;
    private String epost;
    private String antall;
    private String filmer;



    @Override
    public String toString() {
        return "Billett{" +
                "id=" + id +
                ", fornavn='" + fornavn + etternavn +'\'' +
                ", telefonnummer=" + telefonnummer +
                ", epost=" + epost +
                ", antall=" + antall +
                ", filmer=" + filmer +
                '}';
    }
}
