package com.sg.sbo.github.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("github")
@RestController
public class GitHubOauthController {

	@GetMapping
	public String hello(@AuthenticationPrincipal OAuth2User user) {
		return "hello github~~~";
	}
}
