package org.brapi.v2.model;

import java.util.List;




public interface BrAPIResponseResult<T> {
	public void setData(List<T> data);
	public List<T> getData();
}
