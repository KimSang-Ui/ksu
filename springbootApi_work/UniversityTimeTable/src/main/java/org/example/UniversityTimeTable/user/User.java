package org.example.UniversityTimeTable.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Schema(description = "user 테이블입니다.")
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(title = "회원 ID", description = "table에서 자동으로 생성되는 컬럼입니다.")
    private Long userId;

    @Schema(title = "회원 이름", description = "회원 이름을 넣어주세요.")
    private String name;

    @Column(unique = true)
    @Schema(title = "회원 닉네임", description = " 회원 닉네임을 넣어주세요.")
    private String nickname;

    @Column(unique = true)
    @Schema(title = "회원 전화번호", description = "회원 전화번호를 넣어주시면 됩니다.")
    private String phoneNum;

    @Column(unique = true)
    @Schema(title = "회원 이메일", description = "회원 이메일이 겹치지 않게 해줍니다.")
    private String email;

    @Schema(title = "회원 비밀번호", description = "회원 비밀번호는 출력시에 무시되어 출력되지 않습니다.")
    private String password;

    @Schema(title = "회원 studies", description = "회원 학과를 넣어주시면 됩니다.")
    private String studies;

    @Schema(title = "회원 주소", description = "회원 주소를 넣어주시면 됩니다.")
    private String address;

    @Column(unique = true)
    @Schema(title = "회원 이미지 경로", description = "회원 이미지 경로를 넣어주시면 됩니다.")
    private String imagePath;

    @Enumerated(EnumType.STRING)
    @Schema(title = "회원 재학여부", description = " 회원의 재학여부를 확인하는 컬럼입니다.")
    private EnrollmentStatus enrollmentStatus;

    @Enumerated(EnumType.STRING)
    @Schema(title = "학년", description = " 회원의 학년을 확인하는 컬럼입니다.")
    private Grade grade;

    @Enumerated(EnumType.STRING)
    @Schema(title = "회원 회원탈퇴여부", description = " 회원의 회원탈퇴여부를 확인하는 컬럼입니다.")
    private WithdrawStatus withdrawStatus;

    @JsonFormat(pattern = "yyyy/MM/dd")
    @Schema(title = "생성일자", description = "생성일자가 출력되는 칼럼입니다.")
    private LocalDateTime createDate;

    @JsonFormat(pattern = "yyyy/MM/dd")
    @Column(name = "modified_date", insertable = false, updatable = false)
    @Schema(title = "수정일자", description = "수정일자가 출력되는 칼럼입니다.")
    private LocalDateTime modifiedDate;
    
}
