package in.ushatech.securedmcqwebsite.repository;

import in.ushatech.securedmcqwebsite.domain.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question,Long>
{
}
