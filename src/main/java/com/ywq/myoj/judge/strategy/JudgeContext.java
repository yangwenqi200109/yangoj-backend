package com.ywq.myoj.judge.strategy;

import com.ywq.myoj.model.dto.question.JudgeCase;
import com.ywq.myoj.model.dto.questionsubmit.JudgeInfo;
import com.ywq.myoj.model.entity.Question;
import com.ywq.myoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

    public void setJudgeInfo(com.ywq.myoj.judge.codesandbox.model.JudgeInfo judgeInfo) {
    }

}
