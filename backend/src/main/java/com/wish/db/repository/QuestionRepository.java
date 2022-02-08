package com.wish.db.repository;

import com.wish.db.entity.Member;
import com.wish.db.entity.Question;
import com.wish.db.entity.RelationQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 유저 모델 관련 디비 쿼리 생성을 위한 JPA Query Method 인터페이스 정의.
 */
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    // 아래와 같이, Query Method 인터페이스(반환값, 메소드명, 인자) 정의를 하면 자동으로 Query Method 구현됨.

    @Query(value = "select * from question limit 20", nativeQuery = true)
    Optional<List<Question>> findOrderByCountTop20();


//	Optional<Member> findByEmail(String id);
//    //jpql
//    @Query(value = "select * from member where id = ?1 and name = ?2", nativeQuery = true)
//    Optional<Member> find2(String id, String name);
}