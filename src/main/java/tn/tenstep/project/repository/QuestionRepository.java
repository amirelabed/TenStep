package tn.tenstep.project.repository;

import tn.tenstep.project.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

    Question findQuestionByPostedbyAndTimestampAndTopic(String user,String timestamp, String topic);
}
