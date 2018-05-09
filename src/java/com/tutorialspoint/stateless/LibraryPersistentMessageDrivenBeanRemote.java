/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.stateless;

import com.tutorialspoint.entity.Book;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author tiago.lucas
 */
@Remote
public interface LibraryPersistentMessageDrivenBeanRemote {
    void addBooks(Book book);
    List<Book> getBooks();
}
