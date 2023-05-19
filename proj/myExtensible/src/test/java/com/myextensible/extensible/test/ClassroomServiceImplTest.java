package com.myextensible.extensible.test;

import com.myextensible.extensible.ExtensibleApplication;
import com.myextensible.extensible.aspect.DataSourceAspect;
import com.myextensible.extensible.entity.Classroom;
import com.myextensible.extensible.sevice.ClassroomService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExtensibleApplication.class)
class ClassroomServiceImplTest {

    @Autowired
    private ClassroomService classroomService;

    @Resource
    private DataSourceAspect dataSourceAspect;

    @Test
    public void queryClassRoom() {
        List<Classroom> list = classroomService.findAll();
        System.out.println(list);
    }

    @Test
    public void textDataSourceType() {
        dataSourceAspect.dataSourcePointcut();
    }
}
