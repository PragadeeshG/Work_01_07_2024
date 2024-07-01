package com.test1;

public class StompWebsocket {
	private Integer handler;
	private String annotation;
	private String messageMapping;
	private String sendTo;
	private Integer filters;
	private Integer metricFilters;
	private Integer stereotype;
	private String synthetics;
	private String htmlUtils;
	private String webSocketConfig;
	private String enableWebSocketMessageBroker;
	private String enableSimpleBroker;
	private String setApplicationDestinationPrefixes;
	private String addEndpoint;

	public StompWebsocket() {

	}

	public StompWebsocket(Integer handler, String annotation, String messageMapping, String sendTo, Integer filters,
			Integer metricFilters, Integer stereotype, String synthetics, String htmlUtils, String webSocketConfig,
			String enableWebSocketMessageBroker, String enableSimpleBroker, String setApplicationDestinationPrefixes,
			String addEndpoint) {
		super();
		this.handler = handler;
		this.annotation = annotation;
		this.messageMapping = messageMapping;
		this.sendTo = sendTo;
		this.filters = filters;
		this.metricFilters = metricFilters;
		this.stereotype = stereotype;
		this.synthetics = synthetics;
		this.htmlUtils = htmlUtils;
		this.webSocketConfig = webSocketConfig;
		this.enableWebSocketMessageBroker = enableWebSocketMessageBroker;
		this.enableSimpleBroker = enableSimpleBroker;
		this.setApplicationDestinationPrefixes = setApplicationDestinationPrefixes;
		this.addEndpoint = addEndpoint;
	}

	public Integer getHandler() {
		return handler;
	}

	public void setHandler(Integer handler) {
		this.handler = handler;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public String getMessageMapping() {
		return messageMapping;
	}

	public void setMessageMapping(String messageMapping) {
		this.messageMapping = messageMapping;
	}

	public String getSendTo() {
		return sendTo;
	}

	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}

	public Integer getFilters() {
		return filters;
	}

	public void setFilters(Integer filters) {
		this.filters = filters;
	}

	public Integer getMetricFilters() {
		return metricFilters;
	}

	public void setMetricFilters(Integer metricFilters) {
		this.metricFilters = metricFilters;
	}

	public Integer getStereotype() {
		return stereotype;
	}

	public void setStereotype(Integer stereotype) {
		this.stereotype = stereotype;
	}

	public String getSynthetics() {
		return synthetics;
	}

	public void setSynthetics(String synthetics) {
		this.synthetics = synthetics;
	}

	public String getHtmlUtils() {
		return htmlUtils;
	}

	public void setHtmlUtils(String htmlUtils) {
		this.htmlUtils = htmlUtils;
	}

	public String getWebSocketConfig() {
		return webSocketConfig;
	}

	public void setWebSocketConfig(String webSocketConfig) {
		this.webSocketConfig = webSocketConfig;
	}

	public String getEnableWebSocketMessageBroker() {
		return enableWebSocketMessageBroker;
	}

	public void setEnableWebSocketMessageBroker(String enableWebSocketMessageBroker) {
		this.enableWebSocketMessageBroker = enableWebSocketMessageBroker;
	}

	public String getEnableSimpleBroker() {
		return enableSimpleBroker;
	}

	public void setEnableSimpleBroker(String enableSimpleBroker) {
		this.enableSimpleBroker = enableSimpleBroker;
	}

	public String getSetApplicationDestinationPrefixes() {
		return setApplicationDestinationPrefixes;
	}

	public void setSetApplicationDestinationPrefixes(String setApplicationDestinationPrefixes) {
		this.setApplicationDestinationPrefixes = setApplicationDestinationPrefixes;
	}

	public String getAddEndpoint() {
		return addEndpoint;
	}

	public void setAddEndpoint(String addEndpoint) {
		this.addEndpoint = addEndpoint;
	}

}
