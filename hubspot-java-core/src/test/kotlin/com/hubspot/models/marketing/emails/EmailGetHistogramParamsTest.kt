// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailGetHistogramParamsTest {

    @Test
    fun create() {
        EmailGetHistogramParams.builder()
            .addEmailId(0L)
            .endTimestamp("endTimestamp")
            .interval(EmailGetHistogramParams.Interval.DAY)
            .startTimestamp("startTimestamp")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EmailGetHistogramParams.builder()
                .addEmailId(0L)
                .endTimestamp("endTimestamp")
                .interval(EmailGetHistogramParams.Interval.DAY)
                .startTimestamp("startTimestamp")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("emailIds", listOf("0").joinToString(","))
                    .put("endTimestamp", "endTimestamp")
                    .put("interval", "DAY")
                    .put("startTimestamp", "startTimestamp")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailGetHistogramParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
