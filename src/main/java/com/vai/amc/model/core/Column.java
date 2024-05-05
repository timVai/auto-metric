package com.vai.amc.model.core;

import java.util.Objects;

public class Column {
    public String database;
    public String tableName;
    public String columnName;
    public String dataType;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Column)) return false;
        Column column = (Column) o;
        return Objects.equals(database, column.database) && Objects.equals(tableName, column.tableName) && Objects.equals(columnName, column.columnName) && Objects.equals(dataType, column.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, tableName, columnName, dataType);
    }
}
