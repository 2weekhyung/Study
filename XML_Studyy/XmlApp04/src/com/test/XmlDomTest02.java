/*
 * XmlDomTest02.java
 * - 콘솔 기반 자바 프로그램
 * - xml dom 활용- > 로컬(local) xml 읽어내기
 *  (memberList.xml)
 */

// 노은하 010-1234-4567
// 김민지 010-9987-8876

package com.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlDomTest02
{
	public static void main(String[] args)
	{
		
		try
		{	
			
			// 1.xml 파일(memberList.xml)을 메모리에 로드
			// -> XML DOM 생성
			// 2. 루트 엘리먼트 접근
			// 3. 루트 엘리먼트 특정 하위 엘리먼트 접근
			//   ->위치, 이름등을 기준으로 접근(사실상 문법적으로 다양한 접근 방법 지원
			// 4. 텍스트 노드(속성 노드) 접근
			//  -> 원하는 데이터 얻어내기
			// 5. 결과 처리
			// -> 특정 데이터 출력
			
			// dom 객체를 생성하기 위한 리소스 준비
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document xmlObj = null;
			
			// xml 파일을 메모리에 로드 -> xml dom 형성 
			String url = "memberList.xml";
			xmlObj = builder.parse(url);
			
			// 루트 엘리먼트 접근 
			Element root = xmlObj.getDocumentElement();
			
			// 문서의 대표 엘리먼트(루트 엘리먼트)를 얻어내는 과정
			
			// 특정 하위 엘리먼트 접근 -> 위치, 이름 등을 기준으로 접근 
			// 『getElementsByTagName()』 메소드는 태그의 이름을 가지고
			//  자식 (자손) 노드에 접근할 수 있도록 해 주는 메소드
			NodeList memberNodeList = root.getElementsByTagName("memberInfo");
			
			// 이 때 『getElementsByTagName()』메소드는 
			// 태그의 이름을 가지고 자식이나 자손 노드에 접근을 수행하는 메소드
			//	                    ------------------
			//						 (특정 노드)
			
			// ※ check!!
			//    XML 에서 모든 노드는 루트 엘리먼트의 하위에 존재
			
			// 이렇게 얻어낸 NodeList 객체에 포함되어 있는 Node의 개수를
			// getLength() 메소드는 통해 확인할 수 있다.
			// 이를 활용하여 각각의 Node에 접근하는 반복의 횟수를 특정할 수 있다.
			
			
			
			// 테스트
			//System.out.println(memberNodeList.getLength());
			
			for (int i = 0; i < memberNodeList.getLength(); i++) 	// 10번 반복 0-9
			{
				// 『item()』 메소드는 파라미터에 해당하는 인덱스에 위치한
				//  노드에 접근하도록 지원하는 메소드
				Node memberNode = memberNodeList.item(i);	// i -> 0 - 9
				// getElementsByTagName() 메소드가 이름을 통해 대상을 획득했다면..
				// item() 메소드는 위치(인덱스)를 통해 대상을 획득하게 된다.
				
				// 캐스팅(노드를 엘리먼트로..)
				// 캐스트 연산자를 이용하여
				// Node 객체를 Element 객체로 변환하는 것이 가능하다.
				// Node는 상위 객체(자료형)
				//, Element는 하위 객체(자료형)로 다루고 있기 때문이다.
				Element memberElement = (Element)memberNode;
				// 이와 같은 코드 구성이 가능한 이유는
				//  엘리먼트가 노드의 하위 내겸이기 때문에 가능한 구문.
				
				
				// 결과 출력
				System.out.printf("%s : %s%n"
								  , getText(memberElement, "name") 
								  , getText(memberElement, "telephone"));
				/*
					노은하 : 010-1234-4567
					김민지 : 010-9987-8876
				*/
				
				// 대상 문서(memberList.xml)의
				// 커리쿨렴(curriculumn)에 대한 처리 추가 ---------------------------------------------------
				
				// memberList.xml 의
				// memberInfoElement 로부터 curriculumn NodeList 가져오기
				//NodeList  memberNodeList.getElement
				NodeList curriculumnNodeList = memberElement.getElementsByTagName("curriculumn");
				
				// 테스트 
				//System.out.println(curriculumnNodeList.getLength());
				
				//check
				if(curriculumnNodeList.getLength()>0)
				{
					Node curriculumnNode = curriculumnNodeList.item(0);
					Element curriculumnElement= (Element)curriculumnNode;
					
					// 방법 1
					/*
					NodeList subNodeList = curriculumnElement.getElementsByTagName("sub");
					for(int m=0; m<subNodeList.getLength(); m++)
					{
						Node subNode = subNodeList.item(m);
						Element subElement =(Element)subNode;
						System.out.printf("%s", subElement.getTextContent() );
					}
					System.out.println();
					*/
					
					// 방법 2
					/*
					 ------------------- ------------------------------------
					 Node Type 				Named Constant
					 ------------------- ------------------------------------
					    1					ELEMENT_NODE
					    2					ATTRIBUTE_NODE
					    3					TEXT_NODE
					    4					CDATA_SECTION_NODE
					    5					ENTITY_REFERENCE_NODE
					    6					ENTITY_NODE
					    7 					PROCESSING_INSTRUCTION_NODE
					    8					COMMENT_NODE
					    9					DOCUMENT_NODE
					    10					DOCUMENT_TYPE_NODE
					    11					DOCUMENT_FRAGMENT_NODE
					    12					NOTATION_NODE
					 ------------------ -------------------------------------
					 */
					
					
					NodeList subNodeList = curriculumnElement.getChildNodes();	// check!!
					for(int m =0; m<subNodeList.getLength(); m++)
					{
						Node subNode = subNodeList.item(m);
						if (subNode.getNodeType() == 1)		// -- ELEMENT_NODE // check!!
						{
							Element subElement =(Element)subNode;
							System.out.printf("%s" ,subElement.getTextContent());
						}
						System.out.println();
					}
				}
				
				
				// --------------------------------------------------- 커리쿨렴(curriculumn)에 대한 처리 추가 
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}// end main()
	
	
	// 특정 엘리먼트의 텍스트 데이터를 얻어내는 메소드 정의
	private static String  getText(Element parent, String tagName)
	{
		// 반환할 결과 값
		String result ="";
		
		// 특정 태그 이름을 가진 객체의 첫 번째 자식 노드를 얻어온 다음
		Node node = parent.getElementsByTagName(tagName).item(0);
		Element element = (Element)node;
		
		
		// 특정 엘리먼트의 자식 노드(Text Node)의 값 (nodeValue)를 얻어올 수 있도록 처리
		result = element.getChildNodes().item(0).getNodeValue();
				
		
		// 최종 결과물 반환
		return result;
	}
		
}
