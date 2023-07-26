package com.kanjuu.oxydizer

import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class PopupDialogAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
    }

    override fun update(e: AnActionEvent) {
    }

    override fun getActionUpdateThread(): ActionUpdateThread {
        return ActionUpdateThread.BGT
    }
}