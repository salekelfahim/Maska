package org.sicario.controller;

import org.sicario.domain.Member;
import org.sicario.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class MemberController {

    @Autowired
    private MemberService membreService;

    @GetMapping("/")
    public String redirectToMembers() {
        return "redirect:/members";
    }
    @GetMapping("/members")
    public String listMembres(Model model) {
        List<Member> members = membreService.findAll();
        model.addAttribute("members", members);
        return "members";
    }
}
