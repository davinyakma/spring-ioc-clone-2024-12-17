package com.programmers.domain.testPost.testPost.service;

import com.programmers.domain.testPost.testPost.repository.TestPostRepository;
import com.programmers.framework.ioc.annotations.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestPostService {
    private final TestPostRepository testPostRepository;
}