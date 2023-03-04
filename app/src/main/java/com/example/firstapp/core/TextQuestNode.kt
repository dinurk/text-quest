package com.example.firstapp.core

data class TextQuestNode(val fullText: String, val actions: Map<String, TextQuestNode>)