package org.sicario.service;

import org.sicario.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {

    Member save(Member member);
    Member update(Member member);
    void delete(Long id);
    Optional<Member> findById(Long id);
    List<Member> findAll();
}
