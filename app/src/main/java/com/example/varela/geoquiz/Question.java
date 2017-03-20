package com.example.varela.geoquiz;

/**
 * Created by Varela on 1/16/17.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    //get the Text Res ID information
    public int getTextResId() {
        return mTextResId;
    }

    //invoked to see if the answer is true
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    //invoked to give a value to the TextResID
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    //invoked to set an answer set to true
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }


}
