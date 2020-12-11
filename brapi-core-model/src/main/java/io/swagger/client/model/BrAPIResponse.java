package io.swagger.client.model;

public interface BrAPIResponse<T> {

	public void setMetadata(Metadata metadata);
	public void setResult(T result);

}
