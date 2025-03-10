package com.phiworks.boardserver.board.model.member.entity;

import com.phiworks.boardserver.board.model.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "members")
public class MemberEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "members_id")
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, length = 30)
    private String email;
    @Column(nullable = false, length = 50)
    private String password;

}
