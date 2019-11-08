package A_001_dom4j.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 * @author William
 * @date 2019-10-17 15:15
 * @description
 */
public class JAXBTest {

    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Boy.class);

        Marshaller marshaller = context.createMarshaller();
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Boy boy = new Boy();
        marshaller.marshal(boy, System.out);
        System.out.println();
        // <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
        // <ns3:b xmlns:ns2="http://www.carbon.com/age" xmlns:ns3="http://www.carbon.com">
        //      <ns2:a>10</ns2:a>
        //      <name>CY</name>
        // </ns3:b>
        // rootElement 的 ns 必须有 其他字节点的定义 可有可无 有的话会避免在rootElement相同的情况下 子节点也相同 导致解析XML冲突


//        String xml = "<boy><name>David</name></boy>";
//        String xml = "<b xmlns=\"http://www.carbon.com\"><name>David</name></b>";
          String xml = "<b xmlns='http://www.carbon.com'><name>David</name><age>17</age></b>";
//        String xml = "<ns7:b xmlns:ns7='http://www.carbon.com'><name>David</name><age>17</age></ns7:b>";
//        String xml = "<b><name>David</name><age>17</age></b>";
        Boy boy2 = (Boy) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(boy2.name);
    }
}
