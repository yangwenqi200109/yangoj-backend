package com.ywq.myoj.judge.codesandbox;

import com.ywq.myoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.ywq.myoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
