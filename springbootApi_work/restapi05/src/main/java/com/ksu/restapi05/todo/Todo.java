package com.ksu.restapi05.todo;

import com.ksu.restapi05.member.Member;
import jakarta.persistence.*;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String todo;

    @ManyToOne
    //    @JoinColumn(name = "mem_id")
    private Member member;
}
