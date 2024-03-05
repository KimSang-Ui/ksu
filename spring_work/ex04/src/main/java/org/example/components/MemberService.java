package org.example.components;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService implements InitializingBean, DisposableBean {
    @Autowired// new 쓰는 것보다 메모리 낭비를 줄일 수 있다.
    private  MemberRepository memberRepository;

    private String str;

    @Override
    public void afterPropertiesSet() throws Exception {
        str = "jdbc:mysql://192.168.";
        System.out.println("IOC 컨테이너 들어갈 때 ....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("IOC 컨테이너 없어질때...");
    }

    public void regist() {
        memberRepository.insert();
    }
}
