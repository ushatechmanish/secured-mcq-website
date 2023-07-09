package in.ushatech.securedmcqwebsite.bootstrap;

import in.ushatech.securedmcqwebsite.domain.Question;
import in.ushatech.securedmcqwebsite.repository.QuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner
{
    private final QuestionRepository questionRepository;

    public BootStrap(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Question  q1 = new Question();
        q1.setQuestionText("q1");
        q1.setAnswer("a1");
        questionRepository.save(q1);
        System.out.println("Q1 saved");
    }
}
