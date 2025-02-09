package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
@Schema(
    name = "ErrorResponseDto",
    description = "Schema to hold Error response information"
)
public class ErrorResponseDto {

    @Schema(description = "API Path invoked byt the client")
    private String apiPath;

    @Schema(description = "Error Code representing the error happened")
    private HttpStatus errorCode;

    @Schema(description = "Error Message representing the error happened")
    private String errorMessage;

    @Schema(description = "Time when the error happened")
    private LocalDateTime errorTime;
}
