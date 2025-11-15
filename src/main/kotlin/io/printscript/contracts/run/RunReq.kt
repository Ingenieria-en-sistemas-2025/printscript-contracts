package io.printscript.contracts.run

import io.printscript.contracts.Request

data class RunReq(override val language: String, override val version: String, override val content: String, val inputs: List<String>? = null) :
    Request
