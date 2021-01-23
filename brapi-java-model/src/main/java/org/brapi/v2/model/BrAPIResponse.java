package org.brapi.v2.model;

public interface BrAPIResponse<T> {

	public void setMetadata(BrAPIMetadata metadata);
	public void setResult(T result);

}
