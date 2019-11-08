package $_Serializable.fastjson;

import lombok.Data;

/**
 * @author William
 * @date 2019-10-12 10:19
 * @description
 */
@Data
public class Student {

    private String studentName;
    private Integer studentAge;

    public Student(String studentName, Integer studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
}
