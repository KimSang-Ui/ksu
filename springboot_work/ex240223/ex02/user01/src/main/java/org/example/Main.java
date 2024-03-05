package org.example;

import org.example.conf.MyConf;
import org.example.member.MemberDto;
import org.example.member.MemberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static AnnotationConfigApplicationContext context = null;

    public static void main(String[] args) {

        // insert User 등록
        // list User 조회

        context = new AnnotationConfigApplicationContext(MyConf.class);

        processNewCommand();
        processListCommand();
    }

    private static void processListCommand() {
        MemberService memberService = context.getBean(MemberService.class);
        memberService.list();
    }


    private static void processNewCommand() {
        MemberService memberService = context.getBean(MemberService.class);

        MemberDto memberDto = MemberDto.builder()
                .email("aaa@naver.com")
                .name("홍길동")
                .password("1234")
                .confirmPassword("1234")
                .build();

        MemberDto memberDto2 = MemberDto.builder()
                .email("bbb@naver.com")
                .name("박길동")
                .password("1234")
                .confirmPassword("1234")
                .build();
        
        if (!memberDto.isEqualPassword()){
            System.out.println("비밀번호 틀렸다");
            return;
        }

        memberService.regist(memberDto);
        memberService.regist(memberDto2);


    }
}