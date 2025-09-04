package com.thanapong.cruddemo.dao;

import com.thanapong.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/* @Repository : Specialized annotation for repositories
 * This will give us support for component scanning and also handle the
 * Spring support for our exception translation
 */
@Repository
public class StudentDAOImpl implements StudentDAO {

    // define field ofr entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    // Note: Autowired annotation is optional while you have only one constructor
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    // implement save method
    // Add @Transactional since we're performing an update, saving or storing as object in the database
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}
