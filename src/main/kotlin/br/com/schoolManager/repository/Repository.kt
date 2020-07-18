package br.com.schoolManager.repository

import br.com.schoolManager.model.Model

open class Repository(model: Model) {

    private val model: Model = model;

    public fun all(): String {
        return this.model.tableName;
    }

    public fun find(): String {
        return "find"
    }

    public fun create(): String {
        return "create"
    }

    public fun update(): String {
        return "update"
    }

    public fun delete(): String {
        return "delete"
    }

}
