package com.scm.repsitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.entities.Contact;

public interface ContactRepo extends JpaRepository<Contact,String> {
    // Additional query methods can be defined here if needed

}
