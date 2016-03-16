package System;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Parent implements SystemInterface{
	
	String name, product, technicianName,Title;
	double waitTime;
	int process,maxProcess;
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
	
	
	
	@Override
	public String toString() {
		return "Parent [name=" + name + ", product=" + product + ", technicianName=" + technicianName + ", Title="
				+ Title + ", waitTime=" + waitTime + ", process=" + process + ", maxProcess=" + maxProcess + ", date="
				+ date + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + process;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((technicianName == null) ? 0 : technicianName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(waitTime);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parent other = (Parent) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (process != other.process)
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (technicianName == null) {
			if (other.technicianName != null)
				return false;
		} else if (!technicianName.equals(other.technicianName))
			return false;
		if (Double.doubleToLongBits(waitTime) != Double.doubleToLongBits(other.waitTime))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getTechnicianName() {
		return technicianName;
	}
	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}
	public double getWaitTime() {
		return waitTime;
	}
	public void setWaitTime(double waitTime) {
		this.waitTime = waitTime;
	}
	public int getProcess() {
		return process;
	}
	public void setProcess(int process) {
		this.process = process;
	}
	public void nextProcess()
{
	process+=1;
}
	public int getMaxProcess() {
		return maxProcess;
	}
	public void setMaxProcess(int maxProcess) {
		this.maxProcess = maxProcess;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
	
	

}
