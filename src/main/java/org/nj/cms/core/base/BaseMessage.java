package org.nj.cms.core.base;

public class BaseMessage {
	private String error; // 错误码
	private String message = ""; // 错误信息
	private Object result = ""; // 返回结果

	public BaseMessage(String error, String message, Object result) {
		this.error = error;
		if (message != null) {
			this.message = message;
		}
		if (result != null) {
			this.result = result;
		}
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
