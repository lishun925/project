package com.myextensible.extensible.sevice.impl;

import com.myextensible.extensible.entity.Classroom;
import com.myextensible.extensible.mapper.ClassroomMapper;
import com.myextensible.extensible.sevice.ClassroomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @创建人 lishun
 * @创建时间 2022/4/12 12:53
 * @描述
 */
@Service
@Slf4j
public class ClassroomServiceImpl implements ClassroomService {
    @Resource
    private ClassroomMapper classroomMapper;

    @Override
    public List<Classroom> findAll() {
        List<Classroom> list;
        list = classroomMapper.findAll();
        return list;
    }

    @Override
    public Classroom findOne(Integer classroomId) {
        return null;
    }

    @Override
    public String insertOne(Classroom classroom) {
        return null;
    }

    @Override
    public String updateOne(Classroom classroom) {
        return null;
    }

    @Override
    public String deleteOne(Integer classroomId) {
        return null;
    }
}
