package com.kh.api.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.kh.api.vo.AirVo;

public class ApiJavaApp {
	public static final String SERVICE_KEY="ofqTA%2FZ%2BaWbQTRv3V8FwZo4PRD0qIvDAM%2FGzvmWiefwWV%2FsWzs5%2BtHDXpSQ9rgA3WFPrsYxSkqM1g7ypmB%2FPjA%3D%3D";
	public static void main(String[] args) throws IOException {
		//실시간으로 api 요청 순수 java만
		//요청을 보낼 url 필요
		
		//String url= "	http://apis.data.go.kr/B552584/UlfptcaAlarmInqireSvc";
		
		StringBuilder sb = new StringBuilder();
		sb.append("	http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty");
		
		sb.append("?stationName=");
		sb.append(URLEncoder.encode("종로구","UTF-8"));
		sb.append("&dataTerm=month&pageNo=1&numOfRows=100&returnType=xml");
		sb.append("&serviceKey="+SERVICE_KEY);
		String url = sb.toString();
		System.out.println(url);
		
		
		
		URL requestUrl = new URL(url);
		HttpURLConnection urlConnection = (HttpURLConnection) requestUrl.openConnection();
		urlConnection.setRequestMethod("GET");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		//inputStream은 한글을 못읽음: 1byte씩 읽어서 3byte인 한글을 인식 못함
		/*
		String responseXml ="";
		while((responseXml=br.readLine() )!=null) {
			System.out.println(responseXml);
			
			
		}
		
		*/
		String responseJson =br.readLine();
		
		
		//AirVo air = new AirVo();
		//air.setkhaiValue("57");
	}
}	
