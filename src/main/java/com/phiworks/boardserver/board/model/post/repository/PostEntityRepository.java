package com.phiworks.boardserver.board.model.post.repository;

import com.phiworks.boardserver.board.model.post.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, Long> {

}
