package com.github.ichings.mq.common.kernel;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * 标准的返回结果类
 *
 * @author 宋欢
 */
public class Result<T> implements Serializable {
    /**
     * 错误码，0：正确、> 0：错误、禁止 < 0
     */
    private int code;

    /**
     * 错误消息
     */
    private String message;

    /**
     * 内容
     */
    private T data;

    public Result() {
        this.code = Error.SYSTEM_RUN_ERR.getCode();
        this.message = Error.SYSTEM_RUN_ERR.getMessage();
    }

    public boolean isSuccess() {
        return code == Error.SUCCESS_NUM.getCode();
    }

    @JsonIgnore
    public boolean isError() {
        return code != Error.SUCCESS_NUM.getCode();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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

}
