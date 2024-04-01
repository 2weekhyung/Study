/*
 * XmlDomTest03.java
 * - 콘솔 기반 자바 프로그램
 * - xml dom 활용- > 로컬(local) xml 읽어내기
 *  (memList.xml)
 */

package com.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlDomTest03
{
	public static void main(String[] args)
	{
		try
		{
			// xml 파일을 메모리에 올리기, dom 객체 생성할 리소스 준비
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder =  factory.newDocumentBuilder();
			Document xmlObj = null;
			
			// xml 파일을 메모리에 로드 -> xml dom 형성 
			String url = "memList.xml";
			xmlObj = builder.parse(url);
			
			
			
			// 루트 엘리먼트 접근 
			Element root = xmlObj.getDocumentElement();
			
			// 문서의 대표 엘리먼트(루트 엘리먼트)를 얻어내는 과정
			
			// 특정 하위 엘리먼트 접근 -> 위치, 이름 등을 기준으로 접근 
			// 『getElementsByTagName()』 메소드는 태그의 이름을 가지고
			//  자식 (자손) 노드에 접근할 수 있도록 해 주는 메소드
			NodeList memNodeList = root.getElementsByTagName("memInfo");
			
			//System.out.println(memNodeList.getLength());
			for(int i =0; i<memNodeList.getLength(); i++)
			{
				Node memNode = memNodeList.item(i);	
				Element memElement = (Element)memNode;
				
				System.out.printf("이름: %s 나이: %s 전화번호: %s 이메일: %s 주소번호 %s 주소:%s %n" , getText(memElement,"name"),getText(memElement,"age"), getText(memElement,"tel"), getText(memElement,"email"), getText(memElement,"zipCode"), getText(memElement,"add") );
				
			}
			
			
			
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}// end main()
	
	
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
