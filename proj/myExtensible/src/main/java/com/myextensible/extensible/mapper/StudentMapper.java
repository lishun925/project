package com.myextensible.extensible.mapper;

import com.myextensible.extensible.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhenye 2018/8/8
 */
@Mapper
public interface StudentMapper {
    /**
     * 遍历master数据库中的学生表信息
     *
     * @return 学生列表结果集
     */
    List<Student> findAllInMaster();

    /**
     * 清空slave数据库中的student表信息
     */
    void truncateInSlave();

    /**
     * 遍历学生表
     *
     * @return 学生列表结果集
     */
    List<Student> findAll();

    /**
     * 按主键id查询学生信息
     *
     * @param studentId 学生主键id
     * @return 学生信息
     */
    Student findById(Integer studentId);

    /**
     * 新增一名学生
     *
     * @param student 学生参数
     * @return 是否新增成功
     */
    Integer insertOne(Student student);

    /**
     * 更新学生信息
     *
     * @param student 学生对象
     */
    void updateOne(Student student);

    /**
     * 删除一个学生的记录
     *
     * @param studentId 学生主键id
     */
    void deleteById(Integer studentId);

    /**
     * 查找某个班级的所有学生
     *
     * @param classroomId 班级Id
     * @return 学生列表
     */
    List<Student> findByClassroomId(Integer classroomId);

    /**
     * 测试多数据源是否配置成功
     */
    Student findOneInMaster(Integer studentId);

    Student findOneInSlave(Integer studentId);

    /**
     * 查询master数据库中，最近半小时被操作过的student数据
     *
     * @return studentList
     */
    List<Student> findOperatedInPastHalfHourInMaster();

    /**
     * 查询slave数据库中，是否存在该条student记录
     *
     * @param studentId 学生主键id
     * @return 是否存在(存在时 ， 返回1 ； 不存在时 ， 返回0)
     */
    Integer isExistInSlave(Integer studentId);

    /**
     * 将student列表记录，批量插入slave数据库中
     *
     * @param toInsertStudentList student列表记录
     */
    void batchInsertInSlave(List<Student> toInsertStudentList);

    /**
     * 批量更新slave数据库中的student列表记录
     *
     * @param toUpdateStudentList student列表记录
     */
    void batchUpdateInSlave(List<Student> toUpdateStudentList);

    /**
     * 查询master数据库中，昨天被操作过的student数据
     *
     * @return studentList
     */
    List<Student> findOperatedYesterdayInMaster();
}
