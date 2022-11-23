package com.example.springmustachehospital.book.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {

    @Id
    private Long id;
    private String name;
    private String address;

    @OneToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
}
