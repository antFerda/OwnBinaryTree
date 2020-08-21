package main;

public interface INode {
    INode add(final Integer value); //возвращает новую ноду. не меняет состояние дерева внутри. immutable
    void print(); //показывает все дерево
    int count(); //количество элементов в дереве
}
