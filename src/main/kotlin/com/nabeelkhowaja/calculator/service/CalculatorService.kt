package com.nabeelkhowaja.calculator.service

import com.nabeelkhowaja.calculator.Operation
import com.nabeelkhowaja.calculator.Response

interface CalculatorService {
    fun getResult(x: String, y: String, operation: Operation): Response
}