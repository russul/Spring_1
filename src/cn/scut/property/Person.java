package cn.scut.property;

import java.util.List;
import java.util.Map;
import java.util.Properties;

//属性注入
public class Person {
	// 注入基本类型属性
	private String pname;
	// 注入对象类型属性（比如在service中注入dao）
	private User user;
	// 注入复杂类型属性
	private String[] arr;
	private List<String> list;
	private Map<String, String> map;
	private Properties properties;

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void show() {

		System.out.println("hello:" + pname);
	}

	public String getPname() {
		return pname;
	}

	public User getUser() {
		return user;
	}

	public String[] getArr() {
		return arr;
	}

	public List<String> getList() {
		return list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public Properties getProperties() {
		return properties;
	}
}
