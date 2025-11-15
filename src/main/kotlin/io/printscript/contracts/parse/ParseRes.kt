package io.printscript.contracts.parse

import io.printscript.contracts.DiagnosticDto

data class ParseRes(val valid: Boolean, val diagnostics: List<DiagnosticDto>)