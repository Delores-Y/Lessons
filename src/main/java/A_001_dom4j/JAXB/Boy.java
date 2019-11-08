package A_001_dom4j.JAXB;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @author William
 * @date 2019-10-17 15:14
 * @description
 */
@XmlRootElement(name = "b", namespace = "http://www.carbon.com")
// 序列化顺序
//@XmlType(propOrder = {"age", "name"})
// 必须要标明这个元素
//FIELD:    JAXB 绑定类中的每个非静态、非瞬态字段将会自动绑定到 XML，除非由 XmlTransient 注释。
//NONE:     所有字段或属性都不能绑定到 XML，除非使用一些 JAXB 注释专门对它们进行注释。
//PROPERTY: JAXB 绑定类中的每个获取方法/设置方法对将会自动绑定到 XML， 属性 getter & setter除非由 XmlTransient 注释。
//PUBLIC_MEMBER:每个公共获取方法/设置方法对和每个公共字段将会自动绑定到 XML，除非由 XmlTransient 注释。
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlAccessorType(XmlAccessType.PROPERTY)

//@Data
public class Boy {
    String name = "CY";

    @XmlElement(required = true, name = "age", namespace = "http://www.carbon.com/age")
    int age = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
