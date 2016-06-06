package org.iweb.sys.domain;

public class IndexDetail {
	private int uuid;
	private String dept_code;//部门code
	private String kpi;
	private int cyc;//周期
	private double weight;//权重
	private int count_way;//计分方式
	private String definition;//定义
	private String correctly;//标准
	private String info_file;//信息来源文件
	private String info_deptcode;//信息来源部门
	private String check_deptcode;//横向考核部门 
	private String check_post;//横向考核岗位
	private  int isdept;//是否部门得分
	public int getUuid() {
		return uuid;
	}
	public void setUuid(int uuid) {
		this.uuid = uuid;
	}
	public String getDept_code() {
		return dept_code;
	}
	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}
	public String getKpi() {
		return kpi;
	}
	public void setKpi(String kpi) {
		this.kpi = kpi;
	}
	public int getCyc() {
		return cyc;
	}
	public void setCyc(int cyc) {
		this.cyc = cyc;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getCount_way() {
		return count_way;
	}
	public void setCount_way(int count_way) {
		this.count_way = count_way;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public String getCorrectly() {
		return correctly;
	}
	public void setCorrectly(String correctly) {
		this.correctly = correctly;
	}
	public String getInfo_file() {
		return info_file;
	}
	public void setInfo_file(String info_file) {
		this.info_file = info_file;
	}
	public String getInfo_deptcode() {
		return info_deptcode;
	}
	public void setInfo_deptcode(String info_deptcode) {
		this.info_deptcode = info_deptcode;
	}
	public String getCheck_deptcode() {
		return check_deptcode;
	}
	public void setCheck_deptcode(String check_deptcode) {
		this.check_deptcode = check_deptcode;
	}
	public String getCheck_post() {
		return check_post;
	}
	public void setCheck_post(String check_post) {
		this.check_post = check_post;
	}
	public int getIsdept() {
		return isdept;
	}
	public void setIsdept(int isdept) {
		this.isdept = isdept;
	}
}