package in.ushatech.securedmcqwebsite.service;

import in.ushatech.securedmcqwebsite.domain.Question;

import java.util.List;

public interface QuestionService
{
    public Question findQuestionById(Long id);
    List<Question> findAllQuestions();
}
