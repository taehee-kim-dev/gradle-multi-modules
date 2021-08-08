package study.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.domain.Member;
import study.domain.MemberRepository;


@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public Long signup(Member member) {
        return memberRepository.save(member).getId();
    }
}
