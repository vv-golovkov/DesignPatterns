package com.home.designpatterns.creational.builder.version2.code;

public class OuterObject {
    private final int requiredVar1;
    private final int requiredVar2;

    private final int optionalVar1;
    private final int optionalVar2;

    private OuterObject(Builder builder) {
        this.requiredVar1 = builder.requiredVar1;
        this.requiredVar2 = builder.requiredVar2;

        this.optionalVar1 = builder.optionalVar1;
        this.optionalVar2 = builder.optionalVar2;
    }

    public static class Builder {
        private int requiredVar1;
        private int requiredVar2;

        private int optionalVar1 = 88;
        private int optionalVar2 = 99;

        public Builder(int requiredVar1, int requiredVar2) {
            this.requiredVar1 = requiredVar1;
            this.requiredVar2 = requiredVar2;
        }

        public Builder setOptionalVar1(int optionalVar1) {
            this.optionalVar1 = optionalVar1;
            return this;
        }

        public Builder setOptionalVar2(int optionalVar2) {
            this.optionalVar2 = optionalVar2;
            return this;
        }

        public OuterObject build() {
            return new OuterObject(this);
        }
    }
    
    @Override
    public String toString() {
        return String.format("[req.1=%d; req.2=%d; opt.1=%d; opt.2=%d]", requiredVar1, requiredVar2, optionalVar1, optionalVar2);
    }
}
