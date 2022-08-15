package com.example.nfctest

class Extensions {
    companion object {
        fun String.getDisplayMessage(firstArgs: String, secondArg: String): String {
            return String.format(this, firstArgs, secondArg)
        }
    }
}