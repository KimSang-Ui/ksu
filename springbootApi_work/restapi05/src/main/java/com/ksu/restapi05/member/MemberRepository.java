package com.ksu.restapi05.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {

    // select * from member where email = ?
    // 해당하는 email이 있는지 검사하는 메서드
    Optional<Member> findByEmail(String email);
}
