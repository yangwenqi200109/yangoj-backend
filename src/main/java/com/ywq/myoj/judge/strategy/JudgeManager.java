package com.ywq.myoj.judge.strategy;

import com.ywq.myoj.judge.strategy.DefaultJudgeStrategy;
import com.ywq.myoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.ywq.myoj.judge.strategy.JudgeContext;
import com.ywq.myoj.judge.strategy.JudgeStrategy;
import com.ywq.myoj.model.dto.questionsubmit.JudgeInfo;
import com.ywq.myoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
   public JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
