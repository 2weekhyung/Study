 /* XmlDomTest05.java
 * - 콘솔 기반 자바 프로그램
 * - xml dom 활용- > 로컬(local) xml 읽어내기
 * VEHICLES.xml
 */


/*
	---------------------------------------------------------------
	NO		MAKE		YEAR		STYLE				PRICE
	---------------------------------------------------------------
	1		Dodge		1998		Sport Utility		18000
	Options--------------------------------------------------------
		Power_Locks : Yes
		Power_Window : Yes
		Stereo : Radio/Cassette/CD
		Air_Conditioning : Yes
		Automatic : Yes
		Four_Wheel_Drive : Full/Partial
		Note : Very clean
	----------------------------------------------------------------
	2	
*/
package com.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlDomTest05
{
	public static void main(String[] args)
	{
		
		try
		{
			DocumentBuilderFactory facotry = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = facotry.newDocumentBuilder();
			Document xmlObj = null;
			
			String url = "VEHICLES.xml";
			xmlObj = builder.parse(url);
			
			Element root = xmlObj.getDocumentElement();
			
			NodeList vehicList = root.getElementsByTagName("VEHICLE");
			
			//System.out.println(vehicList.getLength());
			
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("NO		MAKE		YEAR		STYLE				PRICE");
			System.out.println("-------------------------------------------------------------------------------------");
			for(int i =0; i< vehicList.getLength(); i++)
			{
				Node vehNode = vehicList.item(i);	
				Element vehElement = (Element)vehNode;
				System.out.printf("%s\t\ts%s\t\t%s\t\t%s\t\t\t%s%n",getText(vehElement, "INVENTORY_NUMBER"),getText(vehElement, "MAKE")
				
				  ,getText(vehElement, "YEAR"),getText(vehElement, "STYLE") ,getText(vehElement, "PRICE"));
				
				System.out.println("Options--------------------------------------------------------------------------");
				
				NodeList optionNodeList = vehElement.getElementsByTagName("OPTIONS");
				
				if(optionNodeList.getLength()>0)
				{
					Node optionNode = optionNodeList.item(0);
					Element optionElement= (Element)optionNode;
					
					NodeList optionNoList = optionElement.getChildNodes();	// check!!
					for(int m =0; m<optionNoList.getLength(); m++)
					{
						Node opNode = optionNoList.item(m);
						
						if(opNode.getNodeType() == 1)
						{
							Element opElement =(Element)opNode;
							System.out.printf("%s :  %s" ,opElement.getTagName() ,opElement.getTextContent());
																	//nodeName()
						}
						
						
						System.out.println();
					}
					System.out.println("--------------------------------------------------------------------------------");
				}
				
				
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
