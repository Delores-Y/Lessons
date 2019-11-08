package A_001_dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.util.Map;

public class Dom4jParseXmlDemo {

    public static void main(String[] args) {

        // 编译后的文件
        System.out.println(Dom4jParseXmlDemo.class.getResource("/my.xml"));
        System.out.println(Dom4jParseXmlDemo.class.getResource("/my.xml").getFile());

        // 工程根目录
        System.out.println(System.getProperty("user.dir"));

        // 系统环境变量
        Map<String, String> systemEnvMap = System.getenv();
        System.out.println(systemEnvMap.toString());

        try (InputStream inputStream = new FileInputStream(new File("src/main/resources/my.xml"))) {

            // 绝对路径
            // InputStream inputStream = new FileInputStream(new File("/Users/heylee/Hubs/Art/Project/Lesson_001/src/main/resources/my.xml"));

            // java.io 默认定位到当前用户目录（"user.dir") 即：工程目录
            // *注意：相对路径的起始处无斜杆"/"
            // InputStream inputStream2 = new FileInputStream(new File("src/main/resources/my.xml"));

            //创建SAXReader读取器，专门用于读取xml
            SAXReader saxReader = new SAXReader();

            //根据saxReader的read重写方法可知，既可以通过inputStream输入流来读取，也可以通过file对象来读取
            Document document = saxReader.read(inputStream);

            Element rootElement = document.getRootElement();
            System.out.println("根节点名称：" + rootElement.getName());
            System.out.println("根节点多少属性：" + rootElement.attributeCount());
            System.out.println("根节点id属性的值：" + rootElement.attribute("id"));
            System.out.println("根节点内文本：" + rootElement.getText());
            System.out.println("根节点内文本：" + rootElement.getTextTrim());

            // 获取子节点
            Element element = rootElement.element("human").element("skill");
            if (element != null)
                System.out.println("子节点文本：" + element.getTextTrim());


        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
}
