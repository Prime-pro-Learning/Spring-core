package com.spring;

public class HolyGrailQuest implements  Quest{
    @Override
    public Object embark() throws QuestFailException {
        return "embark method is calling";
    }
}
