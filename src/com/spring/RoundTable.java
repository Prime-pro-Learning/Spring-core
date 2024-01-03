package com.spring;

import java.util.Objects;

public class RoundTable {
    private String name;

    private Quest quest;

    public RoundTable(String name){
        this.name=name;
       // this.grail=grail;

    }

    public void printGrail() throws QuestFailException {
        if(Objects.nonNull(quest)) {
            System.out.println(quest.embark());
            System.out.println(name);
        }else throw new QuestFailException();
    }
    public void setQuest(Quest grail){
        this.quest=grail;
    }
}
