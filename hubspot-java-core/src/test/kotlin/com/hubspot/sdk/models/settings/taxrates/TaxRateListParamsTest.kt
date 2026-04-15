// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.taxrates

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaxRateListParamsTest {

    @Test
    fun create() {
        TaxRateListParams.builder().active(true).after("after").limit(0).build()
    }

    @Test
    fun queryParams() {
        val params = TaxRateListParams.builder().active(true).after("after").limit(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("active", "true")
                    .put("after", "after")
                    .put("limit", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TaxRateListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
