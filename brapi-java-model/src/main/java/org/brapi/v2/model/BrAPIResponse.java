package org.brapi.v2.model;

public interface BrAPIResponse<T> {

	public void setMetadata(Metadata metadata);
	public void setResult(T result);

}
