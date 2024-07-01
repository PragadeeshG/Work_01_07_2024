package com.test1;

public class StreamingResponseBody {
	private Integer clientLocationId;
	private Integer clientLocationCode;
	private String stream;
	private String getBytes;
	private String xmlHttpRequest;
	private String protocol;
	private String contentType;
	private String contentLength;
	private String geoRestriction;
	private String protocolVersion;
	private String cookies;
	private String hostInfo;
	private String realTimeLogging;
	private String logFlow;

	private StreamingResponseBody() {

	}

	public StreamingResponseBody(Integer clientLocationId, Integer clientLocationCode, String stream, String getBytes,
			String xmlHttpRequest, String protocol, String contentType, String contentLength, String geoRestriction,
			String protocolVersion, String cookies, String hostInfo, String realTimeLogging, String logFlow) {
		super();
		this.clientLocationId = clientLocationId;
		this.clientLocationCode = clientLocationCode;
		this.stream = stream;
		this.getBytes = getBytes;
		this.xmlHttpRequest = xmlHttpRequest;
		this.protocol = protocol;
		this.contentType = contentType;
		this.contentLength = contentLength;
		this.geoRestriction = geoRestriction;
		this.protocolVersion = protocolVersion;
		this.cookies = cookies;
		this.hostInfo = hostInfo;
		this.realTimeLogging = realTimeLogging;
		this.logFlow = logFlow;
	}

	public Integer getClientLocationId() {
		return clientLocationId;
	}

	public void setClientLocationId(Integer clientLocationId) {
		this.clientLocationId = clientLocationId;
	}

	public Integer getClientLocationCode() {
		return clientLocationCode;
	}

	public void setClientLocationCode(Integer clientLocationCode) {
		this.clientLocationCode = clientLocationCode;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getGetBytes() {
		return getBytes;
	}

	public void setGetBytes(String getBytes) {
		this.getBytes = getBytes;
	}

	public String getXmlHttpRequest() {
		return xmlHttpRequest;
	}

	public void setXmlHttpRequest(String xmlHttpRequest) {
		this.xmlHttpRequest = xmlHttpRequest;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentLength() {
		return contentLength;
	}

	public void setContentLength(String contentLength) {
		this.contentLength = contentLength;
	}

	public String getGeoRestriction() {
		return geoRestriction;
	}

	public void setGeoRestriction(String geoRestriction) {
		this.geoRestriction = geoRestriction;
	}

	public String getProtocolVersion() {
		return protocolVersion;
	}

	public void setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	public String getCookies() {
		return cookies;
	}

	public void setCookies(String cookies) {
		this.cookies = cookies;
	}

	public String getHostInfo() {
		return hostInfo;
	}

	public void setHostInfo(String hostInfo) {
		this.hostInfo = hostInfo;
	}

	public String getRealTimeLogging() {
		return realTimeLogging;
	}

	public void setRealTimeLogging(String realTimeLogging) {
		this.realTimeLogging = realTimeLogging;
	}

	public String getLogFlow() {
		return logFlow;
	}

	public void setLogFlow(String logFlow) {
		this.logFlow = logFlow;
	}

}
