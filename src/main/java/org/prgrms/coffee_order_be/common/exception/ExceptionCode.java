package org.prgrms.coffee_order_be.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum ExceptionCode {

  // PRODUCT ERROR
  DUPLICATED_PRODUCT(400, "이미 존재하는 제품입니다."),
  NOT_FOUND_PRODUCT(404, "존재하지 않는 제품입니다.");

  private final int code;
  private final String message;
}
