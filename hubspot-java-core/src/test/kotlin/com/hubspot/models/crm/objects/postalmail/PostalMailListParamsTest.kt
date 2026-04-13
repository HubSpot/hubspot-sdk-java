// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.postalmail

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostalMailListParamsTest {

    @Test
    fun create() {
        PostalMailListParams.builder()
            .after("after")
            .archived(true)
            .addAssociation("string")
            .limit(0)
            .addProperty("string")
            .addPropertiesWithHistory("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PostalMailListParams.builder()
                .after("after")
                .archived(true)
                .addAssociation("string")
                .limit(0)
                .addProperty("string")
                .addPropertiesWithHistory("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("archived", "true")
                    .put("associations", listOf("string").joinToString(","))
                    .put("limit", "0")
                    .put("properties", listOf("string").joinToString(","))
                    .put("propertiesWithHistory", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PostalMailListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
