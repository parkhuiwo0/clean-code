package com.parkhuiwo0.houseutils.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HealthCheckController {

  @GetMapping("/ping")
  public String ping() {
    return "pong";
  }
}
