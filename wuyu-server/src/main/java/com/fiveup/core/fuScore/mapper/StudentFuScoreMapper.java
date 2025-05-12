package com.fiveup.core.fuScore.mapper;

import com.fiveup.core.fuScore.model.ClassFuScore;
import com.fiveup.core.fuScore.model.ClassScore;
import com.fiveup.core.fuScore.model.StudentFuScore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentFuScoreMapper {

    @Select("select morality_score, intelligence_score, physical_score, aesthetic_score, labour_score, evaluate_date " +
            "from fu_student_score where student_num=#{studentNum}")
    List<StudentFuScore> getStudentsFuScore(int studentNum);

    @Select("SELECT morality_score, intelligence_score, physical_score, aesthetic_score, labour_score,remark,evaluate_date as evaluate_date " +
            "FROM fu_student_score WHERE student_name = #{studentName} ;")
    List<StudentFuScore> getStudentFuScoreByName(String studentName);


    //添加name和num。
//    @Select("SELECT morality_score, intelligence_score, physical_score, aesthetic_score, labour_score,remark,evaluate_date as evaluate_date " +
//            "FROM fu_student_score WHERE student_name = #{studentName} or student_num=#{studentNum};")
//    List<StudentFuScore> getStudentFuScoreByName(String studentName);

    @Select("SELECT * FROM fu_student_score WHERE student_num = #{info} OR student_name LIKE CONCAT('%', #{info}, '%')")
    List<StudentFuScore> getScoreByInfo(String info);


    @Select("SELECT morality_score, intelligence_score, physical_score, aesthetic_score, labour_score,remark,evaluate_date as evaluate_date " +
            "FROM fu_student_score WHERE student_num = #{studentNumber};")
    List<StudentFuScore> getStudentFuScoreById(int studentNum);


    @Select("SELECT f.student_name,b.gender,f.class_ID,f.morality_score, f.intelligence_score, f.physical_score, f.aesthetic_score, f.labour_score \n" +
            "FROM fu_student_score f Left Join basic_student  b On f.student_num = b.student_num WHERE f.class_id = #{classId};")
    List<StudentFuScore> getStudentFuScoreByClassId(int classId);
}
