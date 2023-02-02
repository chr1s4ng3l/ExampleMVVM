package data.network

import core.RetrofitHelper
import data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class QuotesService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response: Response<List<QuoteModel>> =
                retrofit.create(QuoteApiClient::class.java).getAllQuates()
             response.body() ?: emptyList()
        }
    }
}