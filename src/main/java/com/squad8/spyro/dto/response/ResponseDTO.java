package com.squad8.spyro.dto.response;

import java.io.Serializable;

public class ResponseDTO<T> implements Serializable {

    private static final long serialVersionUID=1L;

    private String status;
    private String code;
    private String message;
    private T data;

    public ResponseDTO(String status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public ResponseDTO(String status, String code, String message, T data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
