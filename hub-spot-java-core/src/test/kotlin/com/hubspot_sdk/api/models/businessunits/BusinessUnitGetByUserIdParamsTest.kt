// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.businessunits

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessUnitGetByUserIdParamsTest {

    @Test
    fun create() {
        BusinessUnitGetByUserIdParams.builder()
            .userId("userId")
            .addName("string")
            .addProperty("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BusinessUnitGetByUserIdParams.builder().userId("userId").build()

        assertThat(params._pathParam(0)).isEqualTo("userId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BusinessUnitGetByUserIdParams.builder()
                .userId("userId")
                .addName("string")
                .addProperty("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("name", listOf("string").joinToString(","))
                    .put("properties", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BusinessUnitGetByUserIdParams.builder().userId("userId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
