package me.jake.securityjwttutorial.jwt;

import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class JwtSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    private TokenProvider tokenProvider;

    public JwtSecurityConfig(TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    // Security 로직에 필터를 등록
    @Override
    public void configure(HttpSecurity builder) throws Exception {
        JwtFilter customFilter = new JwtFilter(tokenProvider);
        builder.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
    }
}