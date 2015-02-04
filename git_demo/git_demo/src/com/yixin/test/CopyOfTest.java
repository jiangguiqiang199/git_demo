package com.yixin.test;
import java.io.UnsupportedEncodingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class CopyOfTest {

	public static void main(String[] args) {
//		String mobilePhone = "15001021861";
//		String message = "這是一個測試";
//		String endPoint = "http://econnect.hotdotchina.com/econnect/pitf/submit.jsp?uid=wuyou&pswd=wy0051&extno=0051"; 
//		String url = endPoint + "&mob=" + mobilePhone + "&msg=" + message; 
//		
//		// TODO Auto-generated method stub
//		// 定义httpClient的实例
//		HttpClient httpclient = new HttpClient();
//
//		// 创建get方法的实例
//		GetMethod getMethod = new GetMethod("http://xinghuo.yixin.com/sendregistercheckcode.shtml");
//		// 使用系统提供的默认恢复策略
//		// getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
//		// new DefaultHttpMethodRetryHandler());
//
//		// 创建post方法实例
//		PostMethod postMethod = new UTF8PostMethod("http://xinghuo.yixin.com/sendregistercheckcode.shtml");
//		//
//		// //填入各个表单域的值
//		// NameValuePair[] data = {new NameValuePair("user_name",
//		// "user_name"),new NameValuePair("password","password")};
//		//
//		// //将表单的值放入到post方法中
//		// postMethod.setRequestBody(data);
//		//
//		// postMethod.getParams().setParameter(
//		// "http.protocol.cookie-policy",CookiePolicy.BROWSER_COMPATIBILITY);
//		// postMethod.setRequestHeader("Referer", "http://jb51.net");
//		try {
//			// 执行GET方法
//			// int statusCode = httpclient.executeMethod(getMethod);
//			// 执行post方法
//			postMethod.setRequestHeader("Referer", "http://xinghuo.yixin.com/index.shtml");
//			NameValuePair[] data1 = {
//					new NameValuePair("mobile", "13522210361"),
//					new NameValuePair("type", "register"),
//					};
//			postMethod.setRequestBody(data1);
//			for(int i=0;i<5 ; i++){
//				
//				int statusCode = httpclient.executeMethod(postMethod);
//				Thread.sleep(10000);
//			}
//			
//			InputStream responseBody = postMethod.getResponseBodyAsStream();
//			BufferedReader reader = new BufferedReader(new InputStreamReader(
//					responseBody, "utf-8"));
//			String line = reader.readLine();
//			while (line != null) {
//				System.out.println(new String(line.getBytes()));
//				line = reader.readLine();
//			}
//
//		} catch (HttpException e) {
//			// TODO: handle exception
//			System.out.println("Please check your provided http address!");
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO: handle exception
//			System.out.println("the line is wrong!");
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			getMethod.releaseConnection();// 释放链接
//			postMethod.releaseConnection();
//		}
	}

	// Inner class for UTF-8 support
//	public static class UTF8PostMethod extends PostMethod {
//		public UTF8PostMethod(String url) {
//			super(url);
//		}
//
//		@Override
//		public String getRequestCharSet() {
//			// return super.getRequestCharSet();
//			return "UTF-8";
//		}
//	}

}
