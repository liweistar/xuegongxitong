package com.service.xlw;

import com.pojo.xlw.Course;

import java.util.List;

/**
 * @author level
 * @create 2019/5/9 - 14:27
 */
public interface CourseService {
    //增
    void addCourse(Course course);

    //删
    void deleteCourseById(Integer id);

    //更新
    void updateCourse(Course course);

    //根据id差
    Course queryById(Integer id);

    List<Course> queryAllCourse();

    List<Course> queryByType(Course course);

    Course quaryReByName(String coursename);


    //修改状态
    void updateCourseStatus(Course course);

    List<Course> show();

    List<Course> recommend();

    /*List<Course> showa();*/
    List<Course> showb();

    List<Course> showtc(String courseteacher);

    List<Course> showch();
}
