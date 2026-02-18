package com.projects.auth.one_key_backend.dtos;

import org.springframework.http.HttpStatus;

public record ErrorResponse(String message, HttpStatus status, int statusCode) {

}
