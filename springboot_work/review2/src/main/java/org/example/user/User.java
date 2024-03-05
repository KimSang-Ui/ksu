package org.example.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@Builder
@ToString

public class User {
    private Long id;
    private String email;
    private String name;
    private String password;
}



