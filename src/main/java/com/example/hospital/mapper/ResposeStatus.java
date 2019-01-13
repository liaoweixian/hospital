package com.example.hospital.mapper;

public class ResposeStatus {
	private Integer status = 0 ;
	private String message = "";
	private String data  ;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "ResposeStatus [status=" + status + ", message=" + message + ", data=" + data + "]";
	}
	
}
