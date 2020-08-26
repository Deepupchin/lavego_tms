package pojo.initialise;

import java.util.List;

public class Initialise_parent {
	
	private DeviceInfo deviceInfo;
	private String imei;
	private String merchantId;
	private String TerminalId;
	private List <supportedApplications> supportedApplications;

	
	
	
	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getTerminalId() {
		return TerminalId;
	}
	public void setTerminalId(String terminalId) {
		TerminalId = terminalId;
	}
	public List<supportedApplications> getSupportedApplications() {
		return supportedApplications;
	}
	public void setSupportedApplications(List<supportedApplications> supportedApplications) {
		this.supportedApplications = supportedApplications;
	}
	
	

	
	

}
