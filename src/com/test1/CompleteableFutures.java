package com.test1;

public class CompleteableFutures {
	private String streamingCode;
	private String xhrMethod;
	private boolean sseEmitter;
	private Integer nonBlockingService;
	private String eventSource;
	private String getElementById;
	private String createTextNode;
	private String createElement;
	private String appendChild;
	private Integer onMessageEventId;
	private String onMessageEventName;
	private String serverSentEvent;
	private String clientRecievedEvent;

	public CompleteableFutures() {

	}

	public CompleteableFutures(String streamingCode, String xhrMethod, boolean sseEmitter, Integer nonBlockingService,
			String eventSource, String getElementById, String createTextNode, String createElement, String appendChild,
			Integer onMessageEventId, String onMessageEventName, String serverSentEvent, String clientRecievedEvent) {
		super();
		this.streamingCode = streamingCode;
		this.xhrMethod = xhrMethod;
		this.sseEmitter = sseEmitter;
		this.nonBlockingService = nonBlockingService;
		this.eventSource = eventSource;
		this.getElementById = getElementById;
		this.createTextNode = createTextNode;
		this.createElement = createElement;
		this.appendChild = appendChild;
		this.onMessageEventId = onMessageEventId;
		this.onMessageEventName = onMessageEventName;
		this.serverSentEvent = serverSentEvent;
		this.clientRecievedEvent = clientRecievedEvent;
	}

	public String getStreamingCode() {
		return streamingCode;
	}

	public void setStreamingCode(String streamingCode) {
		this.streamingCode = streamingCode;
	}

	public String getXhrMethod() {
		return xhrMethod;
	}

	public void setXhrMethod(String xhrMethod) {
		this.xhrMethod = xhrMethod;
	}

	public boolean isSseEmitter() {
		return sseEmitter;
	}

	public void setSseEmitter(boolean sseEmitter) {
		this.sseEmitter = sseEmitter;
	}

	public Integer getNonBlockingService() {
		return nonBlockingService;
	}

	public void setNonBlockingService(Integer nonBlockingService) {
		this.nonBlockingService = nonBlockingService;
	}

	public String getEventSource() {
		return eventSource;
	}

	public void setEventSource(String eventSource) {
		this.eventSource = eventSource;
	}

	public String getGetElementById() {
		return getElementById;
	}

	public void setGetElementById(String getElementById) {
		this.getElementById = getElementById;
	}

	public String getCreateTextNode() {
		return createTextNode;
	}

	public void setCreateTextNode(String createTextNode) {
		this.createTextNode = createTextNode;
	}

	public String getCreateElement() {
		return createElement;
	}

	public void setCreateElement(String createElement) {
		this.createElement = createElement;
	}

	public String getAppendChild() {
		return appendChild;
	}

	public void setAppendChild(String appendChild) {
		this.appendChild = appendChild;
	}

	public Integer getOnMessageEventId() {
		return onMessageEventId;
	}

	public void setOnMessageEventId(Integer onMessageEventId) {
		this.onMessageEventId = onMessageEventId;
	}

	public String getOnMessageEventName() {
		return onMessageEventName;
	}

	public void setOnMessageEventName(String onMessageEventName) {
		this.onMessageEventName = onMessageEventName;
	}

	public String getServerSentEvent() {
		return serverSentEvent;
	}

	public void setServerSentEvent(String serverSentEvent) {
		this.serverSentEvent = serverSentEvent;
	}

	public String getClientRecievedEvent() {
		return clientRecievedEvent;
	}

	public void setClientRecievedEvent(String clientRecievedEvent) {
		this.clientRecievedEvent = clientRecievedEvent;
	}

}
