package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.core.TextQuest
import com.example.firstapp.core.TextQuestNode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startNode = TextQuestNode(
            "Node 1",
            mapOf(
                "variant 1.1" to TextQuestNode(
                    "Node 1.1",
                    mapOf(
                        "variant 1.1.1" to TextQuestNode(
                            "Node 1.1.1",
                            mapOf()
                        ),
                        "variant 1.1.2" to TextQuestNode(
                            "Node 1.1.2",
                            mapOf()
                        ),
                        "variant 1.1.2" to TextQuestNode(
                            "Node 1.1.2",
                            mapOf()
                        ),
                    )
                ),
                "variant 1.2" to TextQuestNode(
                    "Node 1.2",
                    mapOf(
                        "variant 1.2.1" to TextQuestNode(
                            "Node 1.2.1",
                            mapOf()
                        ),
                        "variant 1.2.2" to TextQuestNode(
                            "Node 1.2.2",
                            mapOf()
                        ),
                    )
                ),
                "variant 1.3" to TextQuestNode(
                    "Node 1.3",
                    mapOf(
                        "variant 1.3.1" to TextQuestNode(
                            "Node 1.3.1",
                            mapOf()
                        ),
                    )
                ),
            )
        )

        val quest = TextQuest(startNode, findViewById(R.id.questMessage))
        quest.start()
    }
}