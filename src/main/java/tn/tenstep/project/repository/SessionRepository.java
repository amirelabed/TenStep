package tn.tenstep.project.repository;

import tn.tenstep.project.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Integer>
{
    Session findSessionBySessionid(Integer id);
    Boolean existsSessionBySessionid(Integer id);
    void removeSessionBySessionid(Integer id);
    Session findSessionByUsernameAndTypeAndIntimeAndOutTimeEquals(String username,String type, String in_time, String outTime);
}