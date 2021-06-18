package com.patterns.decorator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    @Override
    public String decorate() {
        return tree.decorate();
    }

}
