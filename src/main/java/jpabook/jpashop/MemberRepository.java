package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager en;

    public Long save(Member member) {
        en.persist(member);
        return member.getId();
    }

    public Member find(Long id) {
        return en.find(Member.class, id);
    }
}
