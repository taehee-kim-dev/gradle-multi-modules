package study.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.domain.Member;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("MemberService 테스트")
@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @DisplayName("Member signup 테스트")
    @Test
    void signup() {
        //given
        Member member = Member.builder()
                .name("inbi")
                .email("inbi@email.com")
                .build();
        //when
        Long id = memberService.signup(member);
        //then
        assertThat(id).isEqualTo(1L);
    }
}