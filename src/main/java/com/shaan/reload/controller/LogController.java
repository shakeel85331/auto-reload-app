package com.shaan.reload.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogController {

  @GetMapping("/log")
  public void log() {
    log.info("This is a INFO level log");
    log.debug("This is a DEBUG level log");
    log.trace("This is a TRACE level log");
  }

}
