package io.printscript.contracts.events

import io.printscript.contracts.formatter.FormatterOptionsDto
import java.time.Instant
import java.util.UUID

data class FormattingRulesUpdated(val correlationalId: String, val snippetId: UUID, val language: String, val version: String, val configText: String?, val configFormat: String?, val options: FormatterOptionsDto?, val attempt: Int = 0, val createdAt: Instant = Instant.now(),) : DomainEvent