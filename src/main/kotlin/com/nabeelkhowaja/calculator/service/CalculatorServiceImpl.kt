package com.nabeelkhowaja.calculator.service

import com.nabeelkhowaja.calculator.Operation
import com.nabeelkhowaja.calculator.Response
import org.springframework.stereotype.Service

@Service
class CalculatorServiceImpl : CalculatorService {

    override fun getResult(x: String, y: String, operation: Operation): Response {

        if (x.toIntOrNull() == null || y.toIntOrNull() == null)
            return Response(operation, null, "Invalid integer")

        val first = x.toInt()
        val second = y.toInt()

        return when (operation) {
            Operation.ADD -> Response(operation, first + second, null)
            Operation.SUBTRACT -> Response(operation, first - second, null)
            Operation.MULTIPLY -> Response(operation, first * second, null)
            Operation.DIVIDE -> {
                if (second == 0)
                    Response(operation, null, "Second integer can't be zero")
                else
                    Response(operation, first / second, null)
            }
        }
    }
}