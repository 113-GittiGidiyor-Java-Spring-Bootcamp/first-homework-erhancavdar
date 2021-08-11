package dev.sms.service;

import dev.sms.model.Student;
import dev.sms.repository.StudentRepository;
import dev.sms.utilities.EntityManagerUtilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Set;

public class StudentService implements StudentRepository {
    EntityManager entityManager = EntityManagerUtilities.getEntityManager("myJPAConfig");
    @Override
    public void save(Student student) {
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(student);
            entityManager.getTransaction().commit();
            System.out.println("Student successfully saved: "+student);
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            EntityManagerUtilities.closeEntityManager(entityManager);
        }

    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void update(long id) {

    }

    @Override
    public Set<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(long id) {
        return null;
    }
}
