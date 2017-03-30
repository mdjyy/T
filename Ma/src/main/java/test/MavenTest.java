package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MavenTest {
    public static void main(String[] args) {
		SAXReader read = new SAXReader();
	    try {
			Document document = read.read(new FileInputStream("Emp.xml"));
			Element root = document.getRootElement();
			List<Element> list  = root.elements("emp");
			for(Element e:list){
				String name = e.elementText("name");
				System.out.print(name);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
