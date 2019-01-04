package com.infoiv.springmvcshowcase.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
	
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	 @Override
	 protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
	            throws IOException {
	        String targetUrl = determineTargetUrl(authentication);
	        System.out.println(targetUrl);
	 
	        if (response.isCommitted()) {
	            System.out.println("Can't redirect");
	            return;
	        }
	 
	        redirectStrategy.sendRedirect(request, response, targetUrl);
	    }
	 
	private String determineTargetUrl(Authentication authentication) {
		 String url = "";
		 
	        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
	 
	        List<String> roles = new ArrayList<String>();
	 
	        for (GrantedAuthority a : authorities) {
	            roles.add(a.getAuthority());
	        }
	        System.out.println(roles);
	        if (isDba(roles)) {
	            url = "/db";
	        } else if (isAdmin(roles)) {
	            url = "/admin";
	        } else if (isUser(roles)) {
	            url = "/home";
	        } else {
	            url = "/Access_Denied";
	        }
	 
	        return url;
	}
	private boolean isUser(List<String> roles) {
        if (roles.contains("USER")) {
            return true;
        }
        return false;
    }
 
    private boolean isAdmin(List<String> roles) {
        if (roles.contains("ADMIN")) {
            return true;
        }
        return false;
    }
 
    private boolean isDba(List<String> roles) {
        if (roles.contains("DBA")) {
            return true;
        }
        return false;
    }
 
    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.redirectStrategy = redirectStrategy;
    }
 
    protected RedirectStrategy getRedirectStrategy() {
        return redirectStrategy;
    }

}
