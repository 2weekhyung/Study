 /* XmlDomTest04.java
 * - 콘솔 기반 자바 프로그램
 * - xml dom 활용- > 로컬(local) xml 읽어내기
 * breakfast_menu.xml
 */

// breakfast_menu.xml 파일을 대상으로

/*
 	■ [Belgian Waffles] $5.95  650 칼로리
 	- Two of our famous Belgian Waffles with plenty of real maple syrup
 	----------------------------------------------------------------------
 	■ [Strawberry Belgian Waffles] $7.95  900 칼로리
 	- Light Belgian waffles covered with strawberries and whipped cream
 	----------------------------------------------------------------------
 	■ [Berry-Berry Belgian Waffles] $8.95  900 칼로리
 	- Light Belgian waffles covered with an assortment of fresh berries and whipped cream
 	----------------------------------------------------------------------
 	
 */
// 이와 같이 출력되도록 프로그램을 작성한다.
package com.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlDomTest04
{
	public static void main(String[] args)
	{
		try
		{
			// dom 객체 리소스 및 xml 파일 메모리에 올리기
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document xmlObj = null;
			
			String url = "breakfast_menu.xml";
			xmlObj = builder.parse(url);
			
			Element root = xmlObj.getDocumentElement();
			
			NodeList breakList = root.getElementsByTagName("food");
			
			for(int i = 0 ; i<breakList.getLength(); i++)	
			{
				Node breakNode = breakList.item(i);	
				Element breakElement = (Element)breakNode;
				
				
				System.out.printf("■[ %s ] %s %s칼로리 %n - %s%n",getText(breakElement, "name"),getText(breakElement, "price"),getText(breakElement, "calories"),getText(breakElement, "description"));
			}
			
			
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}// end main
	
	
	private static String getText(Element parent , String tagName)
	{
		String result = "";
		
		Node node = parent.getElementsByTagName(tagName).item(0);
		Element element = (Element)node;
		
		
		// 특정 엘리먼트의 자식 노드(Text Node)의 값 (nodeValue)를 얻어올 수 있도록 처리
		result = element.getChildNodes().item(0).getNodeValue();
		
		return result ;
		
	}
}
