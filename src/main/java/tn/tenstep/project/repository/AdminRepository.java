package tn.tenstep.project.repository;

import tn.tenstep.project.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer>
{
    Admin findAdminByUsername(String username);
    Boolean existsAdminByUsername(String username);
    void removeAdminByUsername(String username);
}