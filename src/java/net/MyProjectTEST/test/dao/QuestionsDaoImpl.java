package net.MyProjectTEST.test.dao;


import net.MyProjectTEST.test.model.Questions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by power on 05.03.2017.
 */
public class QuestionsDaoImpl implements QuestionsDao {

private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }


    @Override
    public void addQuestion(Questions questions) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(questions);
    }

    @Override
    public void updateQuestion(Questions questions) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(questions);

    }

    @Override
    public void removeQuestion(int id) {

        Session session = this.sessionFactory.getCurrentSession();
        Questions questions = (Questions) session.load(Questions.class, new Integer(id));
        if(questions!=null){
            session.delete(questions);
        }
    }

    @Override
    public Questions getQuestionById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Questions questions = (Questions) session.load(Questions.class, new Integer(id));
        return questions;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Questions> listQuestions() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Questions> QuestionsList = session.createQuery("from Questions").list();


        return QuestionsList;
    }
}
