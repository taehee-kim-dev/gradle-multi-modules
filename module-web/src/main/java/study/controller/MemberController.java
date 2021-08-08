package study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.domain.Member;

@RestController
public class MemberController {

    @GetMapping("/")
    public Member home() {
        return new Member(1L, "inbi", "inbi@email.com");
    }
}
