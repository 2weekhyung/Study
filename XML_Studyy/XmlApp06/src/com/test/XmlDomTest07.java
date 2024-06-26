/*
	XmlDomTest07.java
	- 콘솔 기반 자바 프로그램
	- XML DOM 활용 -> 원격(local) XML 읽어내기
	(https://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108)
	※ 기상청 날씨 누리로부터 얻어낸 데이터
*/

/*
  http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108  // 전국							
  http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109  // 서울 · 경기도
  http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=105  // 강원도
  http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=131  // 충북
  http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=133  // 충남
  http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=146  // 전북
  http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=156  // 전남
  http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=143  // 경북
  http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=159  // 경남
  http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=184  // 제주
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

public class XmlDomTest07
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] stnId = {"108","109","105","131","133","146","156","143","159","184"};
		
		do
		{
			try
			{
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document xmlObj = null;
				
				// Local XMl 파일 일 경우 ...
				/*
				String url ="rss.xml";
				xmlObj=builder.parse(url);
				*/
				
				// Remote XML 파일인 경우
				
				// 안내 -> 외부의 입력값 처리
				System.out.println("■■■ 기상청 육상 중기 예보 ■■■");
				System.out.println("-----------------------------------");
				System.out.println("1. 전국				");
				System.out.println("2. 서울 · 경기도      ");
				System.out.println("3. 강원도           ");
				System.out.println("4. 충북            ");
				System.out.println("5. 충남            ");
				System.out.println("6. 전북            ");
				System.out.println("7. 전남            ");
				System.out.println("8. 경북            ");
				System.out.println("9. 경남            ");
				System.out.println("10 제주특별자치도 ");
				System.out.println("-----------------------------------");
				System.out.print(">> 지역 선택(종료 0) :");
				String m= sc.next();
				if(m.equals("0"))
					break;
				
				//System.out.println("계속 진행");
				
				
				String str =  String.format("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=%s"
								, stnId[Integer.parseInt(m)-1]);
				
				System.out.println("요청주소 : " +str);
				// >> 지역 선택(종료 0) :6
				// 요청주소 : http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=146
				
				// 문자열로 구성한 요청 주소를 URL 객체 구성  -> 절대 경로 지정 방식
				URL url = new URL(str);
				
				// 구성한 URL 로 접근하여 데이터 내용 읽어오기 -> 스트림(stream)
				InputSource is = new InputSource(url.openStream());
				xmlObj = builder.parse(is);
				
				// -----------------------------------------------------------------------------------------------
				
				// 루트 엘리먼트 접근
				Element root = xmlObj.getDocumentElement();

				// 타이틀 추출하기
				Node titleNode = root.getElementsByTagName("item").item(0);
				Element titleElement =(Element)titleNode;
				System.out.printf("%s" , XMLDOM.getText(titleElement, "title"));
				
				// 기상전망 추출하기
				System.out.println("[기상 전망] -----------------------------------------------------------------");
				
				Node wfNode = root.getElementsByTagName("wf").item(0);
				Element wfElement = (Element)wfNode;
				System.out.printf("%s" , wfElement.getTextContent().replaceAll("<br />","\n"));
				
				// 도시별 기상 예보 추출하기
				System.out.println("[육상 날씨] -----------------------------------------------------------------");
				
				NodeList locationNodeList = root.getElementsByTagName("location");
				for(int i = 0 ; i<locationNodeList.getLength(); i++)
				{
					Node locationNode = locationNodeList.item(i);
					Element locationElement = (Element)locationNode;
					// 도시...
					System.out.println("------------------------------------------------------------------------");
					System.out.printf("도시 :%s%n" ,XMLDOM.getText(locationElement, "city"));
					System.out.println("------------------------------------------------------------------------");
					
					// 날짜 시간/ 날씨예보/ 최저온도 - 최고 온도 / 강수 확률
					NodeList dataNodeList = locationElement.getElementsByTagName("data");
					
					for(int j =0; j< dataNodeList.getLength(); j++)
					{
						Node dataNode = dataNodeList.item(j);
						Element dataElement = (Element)dataNode;
						System.out.printf("날짜 시간 : %s 날짜 예보 : %s %n 최저 온도 : %s ℃ ~ 최고 온도 : %s℃  강수 확률 : %s %% %n" 
								,XMLDOM.getText(dataElement,"tmEf"),XMLDOM.getText(dataElement,"wf"),XMLDOM.getText(dataElement,"tmn"),XMLDOM.getText(dataElement,"tmx"),XMLDOM.getText(dataElement,"rnSt"));
						
						
					}
					
					System.out.println();
				
				
				}
				
				System.out.println();
				
				
				
				
				// -----------------------------------------------------------------------------------------------
				
			} 
			catch (Exception e)
			{
				System.out.println(e.toString());
			}
		} while (true);
		
	}
}
