package br.com.schoolManager.controller

import br.com.schoolManager.model.Model
import br.com.schoolManager.service.Service

open class Controller(model: Model) {

    private val service: Service = Service(model);

    public fun index(): String {
        return this.service.index();
    }

    public fun find(): String {
        return this.service.find()
    }

    public fun create(): String {
        return this.service.create()
    }

    public fun update(): String {
        return this.service.update()
    }

    public fun delete(): String {
        return this.service.update()
    }

}