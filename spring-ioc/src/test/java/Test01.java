import com.kingwan.pojo.ClassRoom;
import com.kingwan.pojo.Student;
import com.kingwan.pojo.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kingwan on 2020/11/10.
 * 说明：
 */
public class Test01 {
    public static void main(String[] args) {
        //会扫描xml中的配置，通过配置信息组装成一个由IOC容器管理的beans
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println("==============Beans初始化完成===============");

        Student student = (Student) context.getBean("stu");

        //1. 属性注入产生的bean
        Teacher teacher = (Teacher) context.getBean("teacher_property");
        System.out.println(teacher.toString()+"地址:"+teacher.getAddress());
        //2. 构造函数注入产生的bean
        Teacher teacher1 = (Teacher) context.getBean("teacher_constructor");
        System.out.println(teacher1.toString()+"姓名:"+teacher1.getName());
        //

        ClassRoom classRoomBean = context.getBean(ClassRoom.class);
        System.out.println(classRoomBean);
    }
}
