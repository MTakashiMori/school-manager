package br.com.schoolManager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SchoolManagerApplication

fun main(args: Array<String>) {
	runApplication<SchoolManagerApplication>(*args)
}
