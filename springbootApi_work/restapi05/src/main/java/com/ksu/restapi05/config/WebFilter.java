//package com.ksu.restapi05.config;
//
//import com.ksu.restapi05.member.Member;
//import com.ksu.restapi05.member.Role;
//import com.mh.restapi05.jwt.TokenManager;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.Jws;
//import io.swagger.v3.oas.annotations.security.SecurityRequirement;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.stream.Stream;
//
//@Component
//public class WebFilter extends OncePerRequestFilter {
//
//    private final TokenManager tokenManager;
//    @Override
//    protected void doFilterInternal(HttpServletRequest request,
//                                    HttpServletResponse response,
//                                    FilterChain filterChain) throws ServletException, IOException{
//        System.out.println("필터 동작");
//
//        String token = request.getHeader("Authorization");
//        String url = request.getRequestURI();
//
//        // 이페이지에서는 token 검사하지 않는다.
//        if(url.contains("login") || url.contains("join") || url.contains("token")){
//            filterChain.doFilter(request, response);
//            return;
//        }
//        if (token == null || !token.startsWith("Bearer ")){
//            System.out.println("token이 없습니다.");
//            throw  new RuntimeException("JWT 토큰 발행후에 해라.");
//        }
//
//        try {
//            Jws<Claims> jws = tokenManager.validateToken(token.substring("Bearer ".length()));
//
//            List<SimpleGrantedAuthority> roles =
//                    Stream.of(jws.getBody().get("role").toString())
//                            .map(SimpleGrantedAuthority::new)
//                            .toList();
//            System.out.println(roles);
//
//            // 로그인한 사람 정보를 Authentication에 저장해라
//            Authentication authentication = UsernamePasswordAuthenticationToken.authenticated(
//                    Member.builder()
//                            .email(jws.getPayload().get("email").toString())
//                            .username(jws.getPayload().get("username").toString())
//                            .id(jws.getPayload().get("id", Long.class))
//                            .role(
//                                    Role.fromString(jws.getPayload().get("role").toString())
//                            )
//
//                            .build(),
//                    null,
//                    roles
//            );
//            // 로그인한 사람 정보를 저장해라
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//            filterChain.doFilter(request, response);
//        }
//        catch (ExpiredJwtException e){
//            System.out.println("토큰 만료");
//            throw new RuntimeException("JWT 토큰 만료");
//        }
//        catch (Exception e){
//            System.out.println("토큰 검증 실패");
//            throw new RuntimeException("JWT 토큰 검증 실패");
//        }
//
////        request.getRequestURI().contains("token"); request 객체의 uri에 token 문자열이 포함되어있는지 확인
//
//
//
//    }
//}
