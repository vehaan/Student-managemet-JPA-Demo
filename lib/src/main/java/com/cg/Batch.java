package com.cg;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBatch3")
public class Batch {
    @Id
    private int batchId;
    private String batchTitle;
    private LocalDate startDate;
    private LocalDate endDate;
	public Batch(int batchId, String batchTitle, LocalDate startDate, LocalDate endDate) {
		super();
		this.batchId = batchId;
		this.batchTitle = batchTitle;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getBatchTitle() {
		return batchTitle;
	}
	public void setBatchTitle(String batchTitle) {
		this.batchTitle = batchTitle;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchTitle=" + batchTitle + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
    
    

    
}