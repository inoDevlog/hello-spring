package hello.hellospring.service;

import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.BeforeEach;

class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }
}