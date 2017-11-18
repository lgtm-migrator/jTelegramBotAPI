package io.jtelegram.api.ex;

import io.jtelegram.api.requests.framework.ResponseParameters;
import lombok.Getter;

@Getter
public class TelegramException extends Exception {
    private int errorCode;
    private String description;
    private ResponseParameters parameters;
}
