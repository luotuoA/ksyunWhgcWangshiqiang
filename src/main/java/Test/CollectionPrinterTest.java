package Test;
import com.ksyun.whgc.wangshiqiang.secondQuestion.CollectionPrinter;
import com.ksyun.whgc.wangshiqiang.secondQuestion.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionPrinterTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("张三",  "北京市海淀区", new Date(2001-1900,1,1)));
        studentList.add(new Student("李四",  "上海市浦东新区", new Date(1999-1900,1,1)));
        studentList.add(new Student("王五",  "广州市天河区", new Date(1999-1900,1,1)));
        CollectionPrinter.printToExcel(studentList, "students.xlsx");
    }
}
