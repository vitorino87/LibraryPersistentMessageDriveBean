/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.stateless;

import com.tutorialspoint.entity.Book;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tiago.lucas
 */
@Stateless
public class LibraryPersistentMessageDrivenBean implements LibraryPersistentMessageDrivenBeanRemote {

    @PersistenceContext(unitName="LibraryPersistentMessageDrivenBeanPU")
    private EntityManager entityManager;
    public void addBooks(Book book) {
        entityManager.persist(book);
    }

    public List<Book> getBooks() {
        return entityManager.createQuery("From Book").getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
