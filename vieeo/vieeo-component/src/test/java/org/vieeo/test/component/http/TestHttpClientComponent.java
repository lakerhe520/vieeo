package org.vieeo.test.component.http;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import com.vieeo.component.http.HttpClientComponent;

public class TestHttpClientComponent extends TestCase{

	public void testPost() throws Exception{
		try {
			HttpClientComponent client = new HttpClientComponent();

			//String url = "http://api.thingture.com/Api/QueryAllProduct";

			//String url = "http://api.thingture.com/Api/QueryProductDetails";

			String url = "http://10.132.97.28:5050/yxcard-management-web/services/rest/consume/vertify";

			Map<String,String> params = new HashMap<String,String>();
			params.put("appId", "zf181");
			params.put("cardNo", "8013359900000500");
			params.put("gameCompanyType", "1");
			params.put("chargeAccount", "123456");
			params.put("version", "1.0");
			params.put("gameCompanyId", "105");
			params.put("userIp", "220.168.36.33");

			System.out.println(client.doPost(url, params));
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}
