package ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import data.model.QuoteModel
import data.model.QuoteProvider
import domain.GetQuotesUseCase
import kotlinx.coroutines.launch

// Extend of ViewModel()
class QuoteViewModel : ViewModel() {

    // Set our dataclass inside a MutableLiveData with a val quoteModel
    val quoteModel = MutableLiveData<QuoteModel>()

    var getQuotesUseCase = GetQuotesUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result: List<QuoteModel>? = getQuotesUseCase()

            if (result.isNullOrEmpty()) {
                quoteModel.postValue(result?.get(0))
            }
        }
    }

    // Method to call
//    fun randomQuote() {
//        val currentQuote = QuoteProvider.random()
//        quoteModel.postValue(currentQuote)
//    }


}