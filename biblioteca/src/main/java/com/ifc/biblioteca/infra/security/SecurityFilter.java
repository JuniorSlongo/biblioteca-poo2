// package com.ifc.biblioteca.infra.security;

// import com.ifc.biblioteca.entity.User;
// import com.ifc.biblioteca.repositories.UserRepository;
// import jakarta.servlet.FilterChain;
// import jakarta.servlet.ServletException;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.stereotype.Component;
// import org.springframework.web.filter.OncePerRequestFilter;

// import java.io.IOException;
// import java.util.Collections;

// @Component
// public class SecurityFilter extends OncePerRequestFilter {
//     @Autowired
//     TokenService tokenService;
//     @Autowired
//     UserRepository userRepository;

//     @Override
//     protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//         var token = this.recoverToken(request);
//         var login = tokenService.validateToken(token);
//         Email email = new Email(login);
//         if(login != null){
//             User user = userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("User Not Found"));
//             var authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
//             var authentication = new UsernamePasswordAuthenticationToken(user, null, authorities);
//             SecurityContextHolder.getContext().setAuthentication(authentication);
//         }
//         filterChain.doFilter(request, response);
//     }

//     private String recoverToken(HttpServletRequest request){
//         var authHeader = request.getHeader("Authorization");
//         if(authHeader == null) return null;
//         return authHeader.replace("Bearer ", "");
//     }
// }