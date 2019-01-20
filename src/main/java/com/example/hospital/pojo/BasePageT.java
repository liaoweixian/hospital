package com.example.hospital.pojo;

import java.io.Serializable;

public class BasePageT implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer page = 1;
	private Integer pageCount = 10;
	private Integer limitStart ;
	private Integer numberPageCount;
	
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
		this.limitStart = this.page - 1;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getNumberPageCount() {
		return numberPageCount;
	}

	public void setNumberPageCount(Integer numberPageCount) {
		this.numberPageCount =(int) Math.ceil((float)numberPageCount / this.pageCount) ;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getLimitStart() {
		return limitStart;
	}

	public void setLimitStart(Integer limitStart) {
		this.limitStart = limitStart;
	}

	@Override
	public String toString() {
		return "BasePageT [page=" + page + ", pageCount=" + pageCount + ", numberPageCount=" + numberPageCount + "]";
	}
	
}
