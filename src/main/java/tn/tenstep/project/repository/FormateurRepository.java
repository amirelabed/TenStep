package tn.tenstep.project.repository;

import tn.tenstep.project.model.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormateurRepository extends JpaRepository<Formateur,Integer> {

    Formateur findInstructorByUsername(String username);
    Boolean existsInstructorByUsername(String username);
    Boolean existsInstructorByEmail(String email);
    void removeInstructorByUsername(String username);
}