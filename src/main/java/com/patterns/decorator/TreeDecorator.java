/**
 * Decorator pattern is used to add new functionality to an existing object without altering its structure.
 * <p>
 * This pattern creates a decorator class which wraps the original class
 * and provides additional functionality keeping class methods signature intact.
 */
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
