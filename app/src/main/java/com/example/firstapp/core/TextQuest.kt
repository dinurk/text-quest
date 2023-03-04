package com.example.firstapp.core

import android.widget.TextView

class TextQuest(private val startNode: TextQuestNode, private val questMessageTextView: TextView) {

    fun start() {
        DisplayableTextQuestNode(startNode, questMessageTextView).display()
    }
}