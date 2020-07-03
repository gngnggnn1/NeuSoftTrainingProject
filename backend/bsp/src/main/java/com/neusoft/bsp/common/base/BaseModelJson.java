package com.neusoft.bsp.common.base;

public class BaseModelJson<T> extends BaseModel {

    public T data;
    public int code;

    public BaseModelJson(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "BaseModelJson{" +
                "data=" + data +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

    //result.data
}
