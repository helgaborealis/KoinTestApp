package net.borlis.koinapplication

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single<MessageRepository> { MessageRepositoryImpl() }

    viewModel { MyViewModel(get()) }
}
