// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailGetParamsTest {

    @Test
    fun create() {
        EmailGetParams.builder()
            .addEmailId(0L)
            .endTimestamp("endTimestamp")
            .property("property")
            .startTimestamp("startTimestamp")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EmailGetParams.builder()
                .addEmailId(0L)
                .endTimestamp("endTimestamp")
                .property("property")
                .startTimestamp("startTimestamp")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("emailIds", listOf("0").joinToString(","))
                    .put("endTimestamp", "endTimestamp")
                    .put("property", "property")
                    .put("startTimestamp", "startTimestamp")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailGetParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
