package study.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("MemberRepository 테스트")
@DataJpaTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @DisplayName("Member save 테스트")
    @Test
    void save() {
        //given
        String name = "inbi";
        Member member = Member.builder()
                .name(name)
                .email("inbi@email.com")
                .build();
        //when
        Member savedMember = memberRepository.save(member);
        //then
        assertThat(savedMember.getName()).isEqualTo(name);
    }
}