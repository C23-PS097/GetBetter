package com.bangkitcapstone.getbetter.model

data class SearchResponse(
    val disease: Disease,
    val medicine: List<Medicine>,
    val food: List<Food>
) {
    data class Disease(
        val disease: String,
        val medical_condition_description: String
    )

    data class Medicine(
        val drug_id: Int,
        val disease: String,
        val drug_name: String,
        val rating: String,
        val pregnancy_category: String,
        val side_effects: String
    )

    data class Food(
        val food_id: Int,
        val disease: String,
        val food_name: String,
        val ingredients: String,
        val recipe: String
    )
}