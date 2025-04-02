package com.scaler.designpatterns.PrototypeAndRegistry;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IntelligentStudent extends Student{
    private int iq;

    IntelligentStudent(){

    }

    IntelligentStudent(IntelligentStudent i){
        super(i);
        this.iq = i.iq;
    }

    public IntelligentStudent copy(){
        IntelligentStudent i = new IntelligentStudent(this);
        return i;
    }

}
