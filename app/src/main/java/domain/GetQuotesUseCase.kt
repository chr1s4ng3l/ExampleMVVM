package domain

import data.QuotesRepository
import data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuotesRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()
}