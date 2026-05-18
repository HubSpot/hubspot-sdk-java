// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

import com.hubspot.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailGetParamsTest {

    @Test
    fun create() {
        EmailGetParams.builder()
            .addEmailId(0L)
            .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .property("property")
            .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EmailGetParams.builder()
                .addEmailId(0L)
                .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .property("property")
                .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("emailIds", listOf("0").joinToString(","))
                    .put("endTimestamp", "2019-12-27T18:11:19.117Z")
                    .put("property", "property")
                    .put("startTimestamp", "2019-12-27T18:11:19.117Z")
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
