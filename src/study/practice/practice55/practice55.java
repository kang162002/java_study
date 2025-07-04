package study.practice.practice55;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class practice55 {

	public static void main(String[] args, ArrayList team) throws Exception {

		String jsonText = "{\r\n"
				+ "\"employees\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 1,\r\n"
				+ "\"name\": \"홍길동\",\r\n"
				+ "\"position\": \"개발자\",\r\n"
				+ "\"salary\": 50000,\r\n"
				+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 2,\r\n"
				+ "\"name\": \"김철수\",\r\n"
				+ "\"position\": \"디자이너\",\r\n"
				+ "\"salary\": 40000,\r\n"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]\r\n"
				+ "}\r\n"
				+ "],\r\n"
				+ "\"company\": {\r\n"
				+ "\"name\": \"주식회사 ABC\",\r\n"
				+ "\"address\": \"서울시 강남구\",\r\n"
				+ "\"established\": \"1990-01-01\",\r\n"
				+ "\"departments\": [\r\n"
				+ "{\r\n"
				+ "\"name\": \"개발부\",\r\n"
				+ "\"employees\": [1, 3, 5]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"name\": \"디자인부\",\r\n"
				+ "\"employees\": [2, 4]\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "},\r\n"
				+ "\"projects\": [\r\n"
				+ "{\r\n"
				+ "\"title\": \"사내 시스템 개발\",\r\n"
				+ "\"budget\": 100000,\r\n"
				+ "\"team\": [1, 3]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"웹 디자인 프로젝트\",\r\n"
				+ "\"budget\": 80000,\r\n"
				+ "\"team\": [2, 4]\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";

		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(jsonText);

		// employees 배열
		JSONArray employees = (JSONArray) obj.get("employees");
		System.out.println("직원 목록:");
		for (Object empObj : employees) {
			JSONObject emp = (JSONObject) empObj;
			System.out.println("- ID: " + emp.get("id"));
			System.out.println("  이름: " + emp.get("name"));
			System.out.println("  직책: " + emp.get("position"));
			System.out.println("  급여: " + emp.get("salary"));
			System.out.print("  기술: ");
			JSONArray skills = (JSONArray) emp.get("skills");
			for (Object skill : skills) {
				System.out.print(skill + " ");
			}
			System.out.println("\n");
		}

		// company 정보
		JSONObject company = (JSONObject) obj.get("company");
		System.out.println("회사 정보:");
		System.out.println("  이름: " + company.get("name"));
		System.out.println("  주소: " + company.get("address"));
		System.out.println("  설립일: " + company.get("established"));

		// 부서 정보
		JSONArray departments = (JSONArray) company.get("departments");
		System.out.println("부서:");
		for (Object d : departments) {
			JSONObject dept = (JSONObject) d;
			System.out.println("  • " + dept.get("name") + " - 직원 ID: " + dept.get("employees"));
		}

		// projects 정보
		JSONArray projects = (JSONArray) obj.get("projects");
		System.out.println("프로젝트:");
		for (Object p : projects) {
			JSONObject proj = (JSONObject) p;
			System.out.println("  " + proj.get("title"));
			System.out.println("     예산: " + proj.get("budget"));
			System.out.println("     팀원 ID: " + proj.get("team"));
			for(int j=0; j<team.size(); j++) {
				System.out.print(team.get(j)+ " ");
			}
			System.out.println();
		}
	}
}
