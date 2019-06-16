package com.example.experiment.repository;

import com.example.experiment.entity.Exam;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamRepository extends CustomizedRepoistory<Exam,Integer>{
    //根据id找考试
    @Query("SELECT e FROM Exam e WHERE e.id=:id")
    Exam findId(@Param("id") int id);
    //根据name找考试
    @Query("SELECT e FROM Exam e WHERE e.name=:name")
    Exam find(@Param("name") String name);
    //根据教室返回考试信息
    @Query("SELECT e FROM Exam e WHERE e.classRoom=:classRoom")
    Exam findClass(@Param("classRoom") String classRoom);
    //查询所有考试
    @Query("SELECT e FROM Exam e")
    List<Exam> liste();

    @Query("SELECT e FROM Exam e WHERE e.name=:name")
    List<Exam> list(@Param("name") String name);
}
