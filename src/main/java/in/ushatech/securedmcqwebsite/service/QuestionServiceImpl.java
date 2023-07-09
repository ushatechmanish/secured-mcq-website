package in.ushatech.securedmcqwebsite.service;

import in.ushatech.securedmcqwebsite.domain.Question;
import in.ushatech.securedmcqwebsite.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService
{
    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public void addQuestion(Question question)
    {
        questionRepository.save(question);
    }

    public Iterable<Question> getAllQuestions()
    {
        return questionRepository.findAll();
    }

    public void save(Question question)
    {
        questionRepository.save(question);
    }

    @Override
    public Question findQuestionById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Question> findAllQuestions()
    {
        List<Question> questions = new ArrayList<>();
        for(Question q : questionRepository.findAll())
        {
            questions.add(q);
        }
        return questions;
    }
}
