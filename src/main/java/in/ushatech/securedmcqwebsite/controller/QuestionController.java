package in.ushatech.securedmcqwebsite.controller;

import in.ushatech.securedmcqwebsite.domain.Question;
import in.ushatech.securedmcqwebsite.service.QuestionServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static in.ushatech.securedmcqwebsite.controller.QuestionController.baseURL;

@RestController
@RequestMapping(baseURL)
public class QuestionController
{
    public static final String baseURL="/";
    private final QuestionServiceImpl questionService;

    public QuestionController(QuestionServiceImpl questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> getQuestions()
    {
        return questionService.findAllQuestions();
    }
    @GetMapping("/{id}")
    public Question getQuestions(@PathVariable Long id)
    {
        return questionService.findQuestionById(id);
    }
}
