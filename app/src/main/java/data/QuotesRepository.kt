package data

import data.model.QuoteModel
import data.model.QuoteProvider

class QuotesRepository {

    private val api = QuotesRepository()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response: List<QuoteModel> = api.getAllQuotes()
        QuoteProvider.quotes = response
        return response
    }
}