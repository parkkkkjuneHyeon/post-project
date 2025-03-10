package com.phiworks.boardserver.board.model.comment.repository;

import com.phiworks.boardserver.board.model.comment.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentEntityRepository extends JpaRepository<CommentEntity, Long> {

}
