package com.example1.demo1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //la base de datos\

    @Temporal(TemporalType.DATE)
    private Date postDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

    @Lob
    @Column(columnDefinition="TEXT")
    private String text;

    @OneToMany
    /*
	@CollectionTable(
		name = "followers",
		joinColumns = @JoinColumn (name = "User_id")
	)
    */
	private List<User> followers = new ArrayList<>();

    //Persist y merge son los unicos necesarios en caso de ser unidireccional
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<User> liked = new ArrayList<>();
}
