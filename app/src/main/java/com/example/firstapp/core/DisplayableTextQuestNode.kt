package com.example.firstapp.core

import android.graphics.Color
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.widget.TextView

class DisplayableTextQuestNode(private val textNode: TextQuestNode, private val questMessageTextView: TextView) {

    fun display() {

        var fullText = textNode.fullText
        textNode.actions.forEach { fullText += "\n" + it.key }

        val spannableString = SpannableString(fullText)

        textNode.actions.forEach { action ->

            val displayableTextQuestNode = DisplayableTextQuestNode(action.value, questMessageTextView)

            val clickableSpan = MyClickableSpan {
                displayableTextQuestNode.display()
            }

            spannableString.setSpan(
                clickableSpan,
                fullText.indexOf(action.key),
                fullText.indexOf(action.key) + action.key.length,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }

        questMessageTextView.run {
            text = spannableString
            movementMethod = LinkMovementMethod.getInstance()
            highlightColor = Color.TRANSPARENT
        }
    }
}