package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMap {
	
	List list;
	Set set;
	Map map;
	public List getList() {
		System.out.println("List is :"+list);
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Set getSet() {
		System.out.println("Set is :"+set);
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Map getMap() {
		System.out.println("Map is :"+map);
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	
}
