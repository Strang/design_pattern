package io.github.strang.designpattern.visitor;

public interface Element {
    public abstract void accept(Visitor v);
}
