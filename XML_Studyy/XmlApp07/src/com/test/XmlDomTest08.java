/*
	XmlDomTest08.java
	- 콘솔 기반 자바 프로그램
	- XML DOM 활용 -> 원격(local) XML 읽어내기
	(https://fs.jtbc.co.kr/RSS/newsflash.xml)
	※ 언론사 뉴스로부터 얻어낸 데이터
*/

/*
	title > JTBC News
	link >https://fs.jtbc.co.kr/RSS/newsflash.xml
	description>속보 RSS
	
	copyright>Copyright(C) JTBC All rights reserved.
	
	
	주요 기사--- 
	title>[날씨] 전국 대체로 흐림…곳곳 미세먼지 '나쁨'
	description 오늘(2일)은 전국이 대체로 흐린 가운데, 일부 지역의 미세먼지가 '나쁨' 수준을 보이겠습니다.낮 최고기온은 3도에서 10도로 포근한 날씨가 예상됩니다.
	link>https://news.jtbc.co.kr/article/article.aspx?news_id=NB12163616
	pubDate>2024.02.02
*/


package com.test;

import java.net.URL;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


public class XmlDomTest08
{
	
	public static void main(String[] args)
	{
		/* 1. 원격 XML 정보를 요청하고 , 그 결과 를 메모리에 로드
			-> XML DOM 구성
			 ·DB 활용
			 ·DBF 활용
			 ·XML 로딩
			2. 루트 엘리먼트 접근
			3. 특정 하위 엘리먼트 접근
			4. 텍스트 노드 접근
			   ->  필요한 데이터 획득
			5. 결과 처리(출력)
		
		*/
		
		try
		{
			// ※ DOM(Document Object Model)
			//   - XML 이나 HTML Document(문서)를 응용 프로그램에서 사용하기 위한 API 규격
			//   - DOM 은 Document(문서)의 각 부분들을 객체(Object)로 표현한 API
			
			// ※ DOM(Document Object Model) 파서(Parser)
			//   - XML 문서를 읽고 해석한후
			//   해석한 결과를 메모리에 DOM 객체 트리 구조로 생성시키는 파서(Parser)
			 //  - 원하는 데이터에 접근할 수 있도록 해주어
			//대상 데이터를 검색, 수정 ,삭제할 수 있도록 지원 
			
			
			DocumentBuilderFactory factory =  DocumentBuilderFactory.newInstance();
			
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document xmlObj = null;
			
			String str =  ("https://fs.jtbc.co.kr/RSS/newsflash.xml");
			
			// 문자열로 구성한 요청 주소를 URL 객체 구성  -> 절대 경로 지정 방식
			URL url = new URL(str);
			
			// 구성한 URL 로 접근하여 데이터 내용 읽어오기 -> 스트림(stream)
			InputSource is = new InputSource(url.openStream());
			xmlObj = builder.parse(is);
			
			// 루트 엘리먼트 생성
			Element root = xmlObj.getDocumentElement();
					
			System.out.printf("%s %n %s %n %s %n %s %n" , XMLDOM.getText(root, "title"),XMLDOM.getText(root, "link"),XMLDOM.getText(root, "description"),XMLDOM.getText(root, "copyright"));
			System.out.println("주요 기사!!");
			System.out.println("----------------------------------------------------------------------------------------");
			NodeList itemNodeList = root.getElementsByTagName("item");
			for(int i = 0 ; i< itemNodeList.getLength(); i++)
			{
				Node itemNode = itemNodeList.item(i);
				Element itemElement = (Element)itemNode;
				System.out.printf("기사 제목 : %s %n", XMLDOM.getText(itemElement, "title"));
				System.out.printf("내용 : %s  %n" , XMLDOM.getText(itemElement, "description").replace(".", ".\n"));
				System.out.printf("링크 : %s  %n" , XMLDOM.getText(itemElement, "link"));
				System.out.printf("게시 날짜 : %s  %n" , XMLDOM.getText(itemElement, "pubDate"));
				
				System.out.println();
				
			}
			
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
}
