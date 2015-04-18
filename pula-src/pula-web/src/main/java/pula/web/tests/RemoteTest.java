package pula.web.tests;

import org.json.JSONObject;

import pula.controllers.http.PostParameter;
import pula.controllers.http.Response;

public class RemoteTest {

	public static void main(String[] args) {
		pula.controllers.http.HttpClient c = new pula.controllers.http.HttpClient();

		try {
			Response r = c
					.post("http://localhost:8125/pula-sys/app/webinterface/teacherLogin",
							new PostParameter("loginId", "007"),
							new PostParameter("password", "tiyi"),
							new PostParameter("ip", "123.123.41.11"));

			JSONObject obj = r.asJSONObject();

			System.out.println(obj);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}