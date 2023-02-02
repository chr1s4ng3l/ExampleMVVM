package data.model

import com.google.gson.annotations.SerializedName

// Data class to set the information
data class QuoteModel(@SerializedName("quote") val quote: String,@SerializedName("author") val author: String)
