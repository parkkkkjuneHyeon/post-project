package com.phiworks.boardserver.board.model.comment.entity;

import com.phiworks.boardserver.board.model.BaseTimeEntity;
import com.phiworks.boardserver.board.model.member.entity.MemberEntity;
import com.phiworks.boardserver.board.model.post.entity.PostEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comments")
public class CommentEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;
    @Column(nullable = false, length = 200)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_member_id", nullable = false)
    private MemberEntity commentAuthor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private PostEntity post;

}
