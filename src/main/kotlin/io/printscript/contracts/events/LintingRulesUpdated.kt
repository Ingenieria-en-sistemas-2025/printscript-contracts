package io.printscript.contracts.events

import java.time.Instant
import java.util.UUID

data class LintingRulesUpdated(val correlationalId: String, val snippetId: UUID, val language: String, val version: String, val configText: String?, val configFormat: String?, val attempt: Int = 0, val createdAt: Instant = Instant.now(),) : DomainEvent