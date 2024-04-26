package org.projects_nj.paymentservice.controllers;

import com.razorpay.RazorpayException;
import org.projects_nj.paymentservice.dtos.InitiatePaymentRequestDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.projects_nj.paymentservice.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping("/initiate")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto requestDto) throws RazorpayException {
        return paymentService.initiatePayment(requestDto.getOrderId(), requestDto.getEmail());
    }

}

