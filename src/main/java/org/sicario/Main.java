package org.sicario;

import org.sicario.domain.Member;
import org.sicario.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MemberService memberService = context.getBean(MemberService.class);

        Member member1 = Member.builder()
                .firstName("Jock")
                .lastName("Ron")
                .build();
        Member member2 = Member.builder()
                .firstName("John")
                .lastName("Doe")
                .build();
        Member member3 = Member.builder()
                .firstName("Sam")
                .lastName("Lit")
                .build();

        memberService.save(member1);
        memberService.save(member2);
        memberService.save(member3);

        List<Member> members=  memberService.findAll();
        members.forEach(System.out::println);
    }
}