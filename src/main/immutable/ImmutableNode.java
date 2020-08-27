package main.immutable;


import java.util.function.Consumer;

public class ImmutableNode implements IMNode<Integer> {


    private final Integer value;
    private final IMNode left;
    private final IMNode right;

    public ImmutableNode(Integer value, IMNode left, IMNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }


    @Override
    public IMNode add(Integer value) {
        if(this.value == value) return this;
        if(value < this.value) {
            if(left == null)
                return new ImmutableNode(this.value, new ImmutableNode(value, null, null), right);
            return new ImmutableNode(this.value, left.add(value), right);
        }

        if(right == null)
            return new ImmutableNode(this.value, null, new ImmutableNode(value, null, null));
        return new ImmutableNode(this.value, left, right.add(value));
    }

    @Override
    public void forEach(Consumer consumer) {
        if(left != null) left.forEach(consumer);
        consumer.accept(value);
        if(right != null) right.forEach(consumer);
    }

    @Override
    public int count() {
        int result = 1;
        if(left != null) result += left.count();
        if(right != null) result += right.count();
        return result;
    }
}
