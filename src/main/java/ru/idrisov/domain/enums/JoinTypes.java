package ru.idrisov.domain.enums;

public enum JoinTypes {
    LEFT("left"),
    INNER("inner");

    private final String joinType;

    JoinTypes(String joinType) {
        this.joinType = joinType;
    }

    public String getJoinType() {
        return joinType;
    }
}
