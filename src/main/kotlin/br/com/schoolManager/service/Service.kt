package br.com.schoolManager.service

import br.com.schoolManager.model.Model
import br.com.schoolManager.repository.Repository

open class Service(model: Model) {

    private val repository: Repository = Repository(model);
    
    public fun index(): String {
        return this.repository.all()
    }

    public fun find(): String {
        return this.repository.find()
    }

    public fun create(): String {
        return this.repository.create()
    }

    public fun update(): String {
        return this.repository.update()
    }

    public fun delete(): String {
        return this.repository.delete()
    }

}
