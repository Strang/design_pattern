package io.github.strang.designpattern.composite;

public abstract class Entry {
    public abstract String getName();                               // 获取名字
    public abstract int getSize();                                  // 获取大小
    public Entry add(Entry entry) throws FileTreatmentException {   // 加入目录条目
        throw new FileTreatmentException();
    }

    /**
     * 为一览加上前缀并显示目录条目一览
     */
    public void printList() {
        printList("");
    }
    
    /**
     * 为一览加上前缀
     * @param prefix 前缀
     */
    protected abstract void printList(String prefix);
    public String toString() {                                      // 显示代表类的文字
        return getName() + " (" + getSize() + ")";
    }
}
