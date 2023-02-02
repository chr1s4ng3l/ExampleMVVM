package data.model

class QuoteProvider {

    // Create a companion object to allow us the access to the method it is like static in Java
    companion object {
        var quotes: List<QuoteModel> = emptyList()
    }
}