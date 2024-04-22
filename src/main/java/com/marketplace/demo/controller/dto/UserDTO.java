package com.marketplace.demo.controller.dto;

import java.util.List;

public record UserDTO(Long id, String username, String password, String email,
                      List<Long> likes, List<Long> payments, List<Long> posts,
                      List<Long> subscribers, List<Long> subscriptions) { }