/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author tiago.lucas
 */
@Entity
@Table(name = "books")
@NamedQueries({
    @NamedQuery(name = "Books.findAll", query = "SELECT b FROM Books b")})
public class Book implements Serializable {

    private static final long serialVersionUID = 5820680045394320146L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    public Book() {
    }

    public Book(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public String toString() {
        return "com.tutorialspoint.entity.Books[ id=" + id + " ]";
    }
    
}
