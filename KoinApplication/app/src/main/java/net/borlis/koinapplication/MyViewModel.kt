package net.borlis.koinapplication

import androidx.lifecycle.ViewModel

class MyViewModel(val repo: MessageRepository) : ViewModel() {
    fun giveMessage() = "${repo.giveMessage()} from $this"
}