package com.github.ajalt.clikt.samples.completion

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.NoRunCliktCommand
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.options.generateCompletionOption
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.versionOption

class CompletionDemo : CliktCommand(
    name = "completion-demo"
) {
    init {
        versionOption("1.2.3")
        generateCompletionOption()
    }

    val opt by option()

    override fun run() {
        echo("This command only demonstrates the generation of programmable auto completion commands")
    }
}

class Subcommand : NoRunCliktCommand() {
    val subopt by option()
}

fun main(args: Array<String>) = CompletionDemo().subcommands(Subcommand()).main(args)
