package io.printscript.contracts.linting

import io.printscript.contracts.DiagnosticDto

data class LintRes(val violations: List<DiagnosticDto>)