// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

import com.hubspot.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailGetHistogramParamsTest {

    @Test
    fun create() {
        EmailGetHistogramParams.builder()
            .addEmailId(0L)
            .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .interval(EmailGetHistogramParams.Interval.DAY)
            .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EmailGetHistogramParams.builder()
                .addEmailId(0L)
                .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .interval(EmailGetHistogramParams.Interval.DAY)
                .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("emailIds", listOf("0").joinToString(","))
                    .put("endTimestamp", "2019-12-27T18:11:19.117Z")
                    .put("interval", "DAY")
                    .put("startTimestamp", "2019-12-27T18:11:19.117Z")
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
