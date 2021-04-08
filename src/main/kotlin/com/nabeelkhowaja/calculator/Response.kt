package com.nabeelkhowaja.calculator

data class Response(
    var operation: Operation,
    var result: Int?,
    var error: String?
)