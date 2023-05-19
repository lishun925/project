import com.service.SmallBusinessService;
import com.service.impl.SmallBusinessServiceImpl;
import com.utils.ResultMsg;
import org.apache.http.entity.ContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author:lishun
 * @create: 2022-10-11 10:52
 * @Description: 导入测试类
 */

@RunWith(SpringRunner.class)
@ContextConfiguration
public class ThreeSmallImportTest {
    @Resource
    public SmallBusinessService smallBusinessService;

    @Test
    public void form() throws IOException {
        String PATH = "C:\\Users\\86187\\Desktop\\临时文档\\导入excel\\";
        String fileName = PATH + "预包装食品导入模板.xlsx";
        File picFile = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(picFile);
        MultipartFile multipartFile = new MockMultipartFile(picFile.getName(), picFile.getName(),
                ContentType.APPLICATION_OCTET_STREAM.toString(), fileInputStream);
        smallBusinessService.importSmallBusiness(multipartFile);
    }

    public static void main(String[] args) throws IOException {
        SmallBusinessServiceImpl smallBusinessService = new SmallBusinessServiceImpl();
        String PATH = "C:\\Users\\86187\\Desktop\\临时文档\\导入excel\\";
        String fileName = PATH + "小经营店销售模板.xlsx";
        File picFile = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(picFile);
        MultipartFile multipartFile = new MockMultipartFile(picFile.getName(), picFile.getName(),
                ContentType.APPLICATION_OCTET_STREAM.toString(), fileInputStream);
        smallBusinessService.importSmallBusiness(multipartFile);
    }

}
