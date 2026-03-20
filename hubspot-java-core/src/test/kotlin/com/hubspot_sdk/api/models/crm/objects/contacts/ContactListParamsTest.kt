// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.contacts

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactListParamsTest {

    @Test
    fun create() {
        ContactListParams.builder()
            .objectType("objectType")
            .after("after")
            .archived(true)
            .addAssociation("string")
            .limit(0)
            .addProperty("string")
            .addPropertiesWithHistory("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ContactListParams.builder().objectType("objectType").build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ContactListParams.builder()
                .objectType("objectType")
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
        val params = ContactListParams.builder().objectType("objectType").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
