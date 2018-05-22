package com.springboot.pojo;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/22 16:45
 * @Description: globalexception
 * <p>
 * 错误实体类
 */
public class ErrorInfo<T> {

    /**
     * 访问成功返回码
     */
    public static final Integer OK = 0;

    /**
     * 错误状况返回码
     */
    public static final Integer ERROR = 100;

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 访问URL
     */
    private String url;

    /**
     * 返回数据
     */
    private T data;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static Integer getOK() {
        return OK;
    }

    public static Integer getERROR() {
        return ERROR;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ErrorInfo{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", url='" + url + '\'' +
                ", data=" + data +
                '}';
    }
}
