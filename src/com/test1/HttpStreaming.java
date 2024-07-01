package com.test1;

public class HttpStreaming {
	private String streamingCode;
	private String streamingName;
	private String streamingType;
	private String responseBodyEmitter;
	private String responseEntity;
	private String executorService;
	private String executors;
	private String newCachedThreadPool;
	private String mediaType;
	private String completeWithError;

	public HttpStreaming() {

	}

	public HttpStreaming(String streamingCode, String streamingName, String streamingType, String responseBodyEmitter,
			String responseEntity, String executorService, String executors, String newCachedThreadPool,
			String mediaType, String completeWithError) {
		super();
		this.streamingCode = streamingCode;
		this.streamingName = streamingName;
		this.streamingType = streamingType;
		this.responseBodyEmitter = responseBodyEmitter;
		this.responseEntity = responseEntity;
		this.executorService = executorService;
		this.executors = executors;
		this.newCachedThreadPool = newCachedThreadPool;
		this.mediaType = mediaType;
		this.completeWithError = completeWithError;
	}

	public String getStreamingCode() {
		return streamingCode;
	}

	public void setStreamingCode(String streamingCode) {
		this.streamingCode = streamingCode;
	}

	public String getStreamingName() {
		return streamingName;
	}

	public void setStreamingName(String streamingName) {
		this.streamingName = streamingName;
	}

	public String getStreamingType() {
		return streamingType;
	}

	public void setStreamingType(String streamingType) {
		this.streamingType = streamingType;
	}

	public String getResponseBodyEmitter() {
		return responseBodyEmitter;
	}

	public void setResponseBodyEmitter(String responseBodyEmitter) {
		this.responseBodyEmitter = responseBodyEmitter;
	}

	public String getResponseEntity() {
		return responseEntity;
	}

	public void setResponseEntity(String responseEntity) {
		this.responseEntity = responseEntity;
	}

	public String getExecutorService() {
		return executorService;
	}

	public void setExecutorService(String executorService) {
		this.executorService = executorService;
	}

	public String getExecutors() {
		return executors;
	}

	public void setExecutors(String executors) {
		this.executors = executors;
	}

	public String getNewCachedThreadPool() {
		return newCachedThreadPool;
	}

	public void setNewCachedThreadPool(String newCachedThreadPool) {
		this.newCachedThreadPool = newCachedThreadPool;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getCompleteWithError() {
		return completeWithError;
	}

	public void setCompleteWithError(String completeWithError) {
		this.completeWithError = completeWithError;
	}

}
