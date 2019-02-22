package com.github.ajalt.clikt.completion

import com.github.ajalt.clikt.core.CliktCommand

/**
 * Generator of autocomplete scripts for a shell.
 */
internal interface CompletionGenerator {
    fun generateCompletion(command: CliktCommand): String
}
