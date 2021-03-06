package interfaces;

import java.util.ArrayList;
import model.Question;

public interface QuestionInterface {
    public ArrayList<Question> getAll(int surveyId);
    public boolean add(Question question);
    public boolean update(Question question);
    public boolean delete(int questionId);
}
