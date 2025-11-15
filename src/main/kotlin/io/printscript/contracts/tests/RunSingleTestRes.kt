package io.printscript.contracts.tests

import io.printscript.contracts.DiagnosticDto

data class RunSingleTestRes(val status: String, val actual: List<String>? = null, val mismatchAt: Int? = null, val diagnostic: DiagnosticDto? = null)
