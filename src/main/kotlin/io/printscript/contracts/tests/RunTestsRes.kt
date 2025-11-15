package io.printscript.contracts.tests

data class RunTestsRes(val summary: SummaryDto, val results: List<SingleTestResultDto>)
