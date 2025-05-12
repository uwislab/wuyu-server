package com.fiveup.core.fuScore.service.impl;

import com.fiveup.core.fuScore.mapper.StudentFuScoreMapper;
import com.fiveup.core.fuScore.model.StudentFuScore;
import com.fiveup.core.fuScore.service.StudentFuScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shilin
 * @date 2022/9/19
 */
@Slf4j
@Service
public class StudentFuScoreServiceImpl implements StudentFuScoreService {


    @Resource
    private StudentFuScoreMapper studentFuScoreMapper;


    @Override
    public List<StudentFuScore> getStudentsFuScore(int studentId) {
        List<StudentFuScore> studentScore;
        studentScore = studentFuScoreMapper.getStudentsFuScore(studentId);
        return studentScore;
    }

    //通过学号或者姓名获取学生所有五育成绩以及期末评语
    @Override
    public List<StudentFuScore> getStudentsFuScore(String studentName, int studentId) {
        List<StudentFuScore> studentFuScore = null;
        if (studentId != 0) {
            studentFuScore = studentFuScoreMapper.getStudentFuScoreById(studentId);
        } else if (studentName != null) {
            {
                studentFuScore = studentFuScoreMapper.getStudentFuScoreByName(studentName);
            }
        }
        return studentFuScore;
    }

    @Override
    public List<StudentFuScore> getScoreByInfo(String info) {
        return studentFuScoreMapper.getScoreByInfo(info);
    }
}
