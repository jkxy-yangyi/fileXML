import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;


public class Test {

	public static void main(String[] args) {
		String xmlString = "<root><people>ACELY</people></root>";
		
		try {
			
			
			
			Document document = DocumentHelper.parseText(xmlString);//通过文本将字符串转为Document对象
			
			System.out.println(document.asXML());//将document转为字符串对象
			
			
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}
