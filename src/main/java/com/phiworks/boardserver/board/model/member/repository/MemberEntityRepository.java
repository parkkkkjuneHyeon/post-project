package com.phiworks.boardserver.board.model.member.repository;

import com.phiworks.boardserver.board.model.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberEntityRepository extends JpaRepository<MemberEntity, Long> {

}
