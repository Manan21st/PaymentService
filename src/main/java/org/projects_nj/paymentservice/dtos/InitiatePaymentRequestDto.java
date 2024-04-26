package org.projects_nj.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class InitiatePaymentRequestDto {
    private Long orderId;
    private String email;
}
