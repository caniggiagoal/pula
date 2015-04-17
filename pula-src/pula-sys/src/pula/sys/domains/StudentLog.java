package pula.sys.domains;

import java.util.Calendar;

public class StudentLog {

	private long id;
	private String event, extendInfo;
	private Branch branch; // 当时从属
	private Student student;
	private String ip;
	private Calendar eventTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getExtendInfo() {
		return extendInfo;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Calendar getEventTime() {
		return eventTime;
	}

	public void setEventTime(Calendar eventTime) {
		this.eventTime = eventTime;
	}

}
