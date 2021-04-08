package com.nabeelkhowaja.calculator.controller

import com.nabeelkhowaja.calculator.Operation
import com.nabeelkhowaja.calculator.Response
import com.nabeelkhowaja.calculator.service.CalculatorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CalculatorController {

    @Autowired
    private lateinit var calculatorService: CalculatorService

    @GetMapping("/add/{x}/{y}")
    fun add(@PathVariable x: String, @PathVariable y: String): Response =
        calculatorService.getResult(x, y, Operation.ADD)

    @GetMapping("/sub/{x}/{y}")
    fun subtract(@PathVariable x: String, @PathVariable y: String): Response =
        calculatorService.getResult(x, y, Operation.SUBTRACT)

    @GetMapping("/mul/{x}/{y}")
    fun multiply(@PathVariable x: String, @PathVariable y: String): Response =
        calculatorService.getResult(x, y, Operation.MULTIPLY)

    @GetMapping("/div/{x}/{y}")
    fun divide(@PathVariable x: String, @PathVariable y: String): Response =
        calculatorService.getResult(x, y, Operation.DIVIDE)
}